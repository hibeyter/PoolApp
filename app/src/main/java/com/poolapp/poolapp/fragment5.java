package com.poolapp.poolapp;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class fragment5 extends Fragment {

    Context context = this.getActivity();
    dB db = new dB(getActivity());
    static SQLiteDatabase database;
    //
    static Spinner gunler;
    static Spinner saatler;
    static EditText yuzme_edit;
    static EditText lisansno_edit;
    static EditText yarislar_edit;
    static EditText antrenor_edit;
    Button kaydet_btn;
    String name = "";
    //


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment5_layout, container, false);
        gunler = view.findViewById(R.id.gunler);
        saatler = view.findViewById(R.id.saatler);
        yuzme_edit = view.findViewById(R.id.yuzme_edit);
        lisansno_edit = view.findViewById(R.id.lisansno_edit);
        yarislar_edit = view.findViewById(R.id.yarislar_edit);
        antrenor_edit = view.findViewById(R.id.antrenor_edit);
        kaydet_btn = view.findViewById(R.id.kaydet_btn);
        kaydet_btn.setOnClickListener(new kayit());
        return view;
    }
    public void cek(){
        if(fragment1.ad_edit.getText().toString() != null)
        name = fragment1.ad_edit.getText().toString();
    }

    class kayit implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            try{
                database = getActivity().openOrCreateDatabase("PoolApp",Context.MODE_PRIVATE,null);
                database.execSQL("CREATE TABLE IF NOT EXISTS users(img BLOB, ad VARCHAR, soyad VARCHAR," +
                        "tc VARCHAR,date VARCHAR ,cinsiyet VARCHAR, ameslek VARCHAR, bmeslek VARCHAR, okul VARCHAR, sinif VARCHAR, " +
                        "tel VARCHAR, mail VARCHAR, adres VARCHAR, yakintel VARCHAR, evtel VARCHAR, isadresi VARCHAR," +
                        "kangrb VARCHAR, saglik VARCHAR, ameliyat VARCHAR, ilac VARCHAR, boy VARCHAR, kilo VARCHAR, " +
                        "koluzunlugu VARCHAR, bacak VARCHAR, omuz VARCHAR, gun VARCHAR, saat VARCHAR, yuzme VARCHAR, " +
                        "antrenor VARCHAR, lisansno VARCHAR, yarismalar VARCHAR)");
                Bitmap bitmap;
                bitmap = ((BitmapDrawable) fragment1.imageView.getDrawable()).getBitmap();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
                byte[] img = baos.toByteArray();
                users us = new users(img,fragment1.ad_edit.getText().toString(),fragment1.soyad_edit.getText().toString(),
                        fragment1.tc_edit.getText().toString(),fragment1.txtDate.getText().toString(),fragment6.cinsiyet.getSelectedItem().toString(),
                        fragment6.annemeslek_edit.getText().toString(),fragment6.babameslek_edit.getText().toString(),
                        fragment6.okul_edit.getText().toString(),fragment6.sinif_edit.getText().toString(),
                        fragment2.telno_edit.getText().toString(),fragment2.mail_edit.getText().toString(),
                        fragment2.adres_edit.getText().toString(),fragment2.yakintelno_edit.getText().toString(),
                        fragment2.evtelno_edit.getText().toString(),fragment2.isadresi_edit.getText().toString(),
                        fragment3.kangr.getSelectedItem().toString(),fragment3.saglikproblemi_edit.getText().toString(),
                        fragment3.ameliyat_edit.getText().toString(),fragment3.ilac_edit.getText().toString(),
                        fragment4.boy_edit.getText().toString(),fragment4.kilo_edit.getText().toString(),
                        fragment4.kolboyu_edit.getText().toString(),fragment4.bacak_edit.getText().toString(),
                        fragment4.omuz_edit.getText().toString(),yuzme_edit.getText().toString(),gunler.getSelectedItem().toString(),
                        saatler.getSelectedItem().toString(),antrenor_edit.getText().toString(),lisansno_edit.getText().toString(),
                        yarislar_edit.getText().toString());
                        String query = "Insert Into users (img, ad, soyad, tc, date, cinsiyet, ameslek, bmeslek, okul, sinif, tel," +
                        "mail, adres, yakintel, evtel, isadresi, kangrb, saglik, ameliyat, ilac, boy, kilo, koluzunlugu," +
                        "bacak, omuz, gun, saat, yuzme, antrenor, lisansno, yarismalar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
                        "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                SQLiteStatement statement = database.compileStatement(query);
                statement.bindBlob(1,us.getIMAGE());
                statement.bindString(2,us.getNAME());
                statement.bindString(3,us.getSURNAME());
                statement.bindString(4,us.getTC());
                statement.bindString(5,us.getDATE());
                statement.bindString(6,us.getSEX());
                statement.bindString(7,us.getMOMJOB());
                statement.bindString(8,us.getDADJOB());
                statement.bindString(9,us.getSCHOOL());
                statement.bindString(10,us.getCLASS());
                statement.bindString(11,us.getTEL());
                statement.bindString(12,us.getMAIL());
                statement.bindString(13,us.getADRESS());
                statement.bindString(14,us.getYAKINTEL());
                statement.bindString(15,us.getHOMETEL());
                statement.bindString(16,us.getJOBADRESS());
                statement.bindString(17,us.getBLOODTYPE());
                statement.bindString(18,us.getHEALTHPROBLEM());
                statement.bindString(19,us.getSURGERY());
                statement.bindString(20,us.getDRUG());
                statement.bindString(21,us.getLENGTH());
                statement.bindString(22,us.getWEIGHT());
                statement.bindString(23,us.getARM());
                statement.bindString(24,us.getLEG());
                statement.bindString(25,us.getSHOULDER());
                statement.bindString(26,us.getDAY());
                statement.bindString(27,us.getHOUR());
                statement.bindString(28,us.getSWIMINF());
                statement.bindString(29,us.getANTRENOR());
                statement.bindString(30,us.getLICENCE());
                statement.bindString(31,us.getRACINGS());
                statement.execute();
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle(us.getNAME()+" "+us.getSURNAME()+" Başarılı Şekilde Kayıt Edildi!");
                AlertDialog alert = builder.create();
                alert.show();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    class kullaniciKaydet implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            try{
                Bitmap bitmap;
                bitmap = ((BitmapDrawable) fragment1.imageView.getDrawable()).getBitmap();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
                byte[] img = baos.toByteArray();
               // db.onUpgrade(db.getWritableDatabase(), 1, 2);
                db.addUser(new users(img,fragment1.ad_edit.getText().toString(),fragment1.soyad_edit.getText().toString(),
                        fragment1.tc_edit.getText().toString(),fragment6.cinsiyet.getSelectedItem().toString(),fragment1.txtDate.getText().toString(),
                        fragment6.annemeslek_edit.getText().toString(),fragment6.babameslek_edit.getText().toString(),
                        fragment6.okul_edit.getText().toString(),fragment6.sinif_edit.getText().toString(),
                        fragment2.telno_edit.getText().toString(),fragment2.mail_edit.getText().toString(),
                        fragment2.adres_edit.getText().toString(),fragment2.yakintelno_edit.getText().toString(),
                        fragment2.evtelno_edit.getText().toString(),fragment2.isadresi_edit.getText().toString(),
                        fragment3.kangr.getSelectedItem().toString(),fragment3.saglikproblemi_edit.getText().toString(),
                        fragment3.ameliyat_edit.getText().toString(),fragment3.ilac_edit.getText().toString(),
                        fragment4.boy_edit.getText().toString(),fragment4.kilo_edit.getText().toString(),
                        fragment4.kolboyu_edit.getText().toString(),fragment4.bacak_edit.getText().toString(),
                        fragment4.omuz_edit.getText().toString(),yuzme_edit.getText().toString(),gunler.getSelectedItem().toString(),
                        saatler.getSelectedItem().toString(),antrenor_edit.getText().toString(),lisansno_edit.getText().toString(),
                        yarislar_edit.getText().toString()));
                System.out.println("as");
                db.close();
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Üye Kaydı Başarılı!");
                AlertDialog alert = builder.create();
                alert.show();
            }
            catch (Exception e){
                System.out.println("Hata Var Selin Kendine Gel");
                e.printStackTrace();
            }
        }
    }
}

package com.poolapp.poolapp;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class guncelle_6 extends Fragment {
    Button guncelle_btn;
    Context context;
    public static EditText guncel_yuzme;
    public static EditText guncel_antrenor;
    public static EditText guncel_lisansno;
    public static EditText guncel_yaris;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment5_layout, container, false);
        guncelle_btn = myView.findViewById(R.id.kaydet_btn);
        guncelle_btn.setText("Güncelle");

        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        guncel_yuzme = getActivity().findViewById(R.id.yuzme_edit);
        guncel_antrenor = getActivity().findViewById(R.id.antrenor_edit);
        guncel_lisansno = getActivity().findViewById(R.id.lisansno_edit);
        guncel_yaris = getActivity().findViewById(R.id.yarislar_edit);

        guncel_yuzme.setText(uyeGuncelle.us.getSWIMINF());
        guncel_antrenor.setText(uyeGuncelle.us.getANTRENOR());
        guncel_lisansno.setText(uyeGuncelle.us.getLICENCE());
        guncel_yaris.setText(uyeGuncelle.us.getRACINGS());
        guncelle_btn.setOnClickListener(new guncelle());
    }
    class guncelle implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            try{
                fragment5.database = getActivity().openOrCreateDatabase("PoolApp",Context.MODE_PRIVATE,null);
               final ContentValues cv= new ContentValues();
                cv.put("ad",guncelle_1.guncel_ad.getText().toString());
                cv.put("soyad",guncelle_1.guncel_soyad.getText().toString());
                cv.put("tc",guncelle_1.guncel_tc.getText().toString());
                cv.put("date",guncelle_1.guncel_tarih.getText().toString());
              //  cv.put("cinsiyet",);
                cv.put("ameslek",guncelle_2.guncel_annemeslek.getText().toString());
                cv.put("bmeslek",guncelle_2.guncel_babameslek.getText().toString());
                cv.put("okul",guncelle_2.guncel_okul.getText().toString());
                cv.put("sinif",guncelle_2.guncel_sinif.getText().toString());
                System.out.println("1-"+uyeGuncelle.us.getTEL());
                cv.put("tel",guncelle_3.guncel_telno.getText().toString());
                cv.put("mail",guncelle_3.guncel_mail.getText().toString());
                cv.put("adres",guncelle_3.guncel_adres.getText().toString());
                cv.put("yakintel",guncelle_3.guncel_yakintel.getText().toString());
                cv.put("evtel",guncelle_3.guncel_evtel.getText().toString());
                cv.put("isadresi",guncelle_3.guncel_isadresi.getText().toString());
                cv.put("saglik",guncelle_4.guncel_saglikproblemi.getText().toString());
                cv.put("ameliyat",guncelle_4.guncel_ameliyat.getText().toString());
                cv.put("ilac",guncelle_4.guncel_ilac.getText().toString());
                cv.put("boy",guncelle_5.guncel_boy.getText().toString());
                cv.put("kilo",guncelle_5.guncel_kilo.getText().toString());
                cv.put("koluzunlugu",guncelle_5.guncel_kol.getText().toString());
                cv.put("bacak",guncelle_5.guncel_bacak.getText().toString());
                cv.put("omuz",guncelle_5.guncel_omuz.getText().toString());
                cv.put("yuzme",guncelle_6.guncel_yuzme.getText().toString());
                cv.put("antrenor",guncelle_6.guncel_antrenor.getText().toString());
                cv.put("lisansno",guncelle_6.guncel_lisansno.getText().toString());
                cv.put("yarismalar",guncelle_6.guncel_yaris.getText().toString());


               final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
                builder.setMessage("Güncellemek İstediğinize Emin Misiniz? ")
                        .setCancelable(false)
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                fragment5.database.update("users",cv,"tc = ?",new String[]{uyeGuncelle.us.getTC()});
               dialog.cancel();
               startActivity(new Intent(getContext(),MainActivity.class));
                                }

            })
                    .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    System.out.println("kaydetmedi");
                    dialog.cancel();
                }
            });
                android.app.AlertDialog alert = builder.create();
                alert.show();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package com.poolapp.poolapp;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ucret extends AppCompatActivity {
    List<ayVeucret> listucret = new ArrayList<>();
    List<ucretUye> ucuye = new ArrayList<>();
    List<String> isim = new ArrayList<>();
    Context context = this;
    ListView listView;
    Spinner gun;
    Spinner saat;
    Spinner kisi;
    cusadapucret adapter;
    Button kaydet;
    ImageView img;
    TextView name;
    EditText ucretMiktar;
    int pos;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucret);
        listView = findViewById(R.id.ls);
        gun = findViewById(R.id.gun);
        saat = findViewById(R.id.saat);
        kisi = findViewById(R.id.ogrenci);
        kaydet = findViewById(R.id.kaydet);
        img = findViewById(R.id.foto);
        name = findViewById(R.id.name);
        ucretMiktar = findViewById(R.id.ucret);
        gun.setOnItemSelectedListener(new ogrenciSec());
        saat.setOnItemSelectedListener(new ogrenciSec());
        kisi.setOnItemSelectedListener(new veriCek());
        kaydet.setOnClickListener(new kaydetVeri());
        adapter = new cusadapucret(context, listucret);
        listView.setAdapter(adapter);
    }
    class ogrenciSec implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            try{
                String day = gun.getSelectedItem().toString();
                String hour = saat.getSelectedItem().toString();
                fragment5.database = openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
                Cursor cursor = fragment5.database.rawQuery("Select ad, soyad, tc, img from users where gun=? and saat=?",new String[]{day,hour});
                int ixad = cursor.getColumnIndex("ad");
                int ixsoyad = cursor.getColumnIndex("soyad");
                int ixtc = cursor.getColumnIndex("tc");
                int ixfoto = cursor.getColumnIndex("img");
                cursor.moveToFirst();
                ucuye.clear();
                isim.clear();
                img.setImageBitmap(null);
                name.setText(null);
                kisi.setAdapter(null);
                listView.setAdapter(null);

                while (cursor != null)
                {
                    ucretUye yeni = new ucretUye(cursor.getString(ixad),cursor.getString(ixsoyad),cursor.getString(ixtc),cursor.getBlob(ixfoto));
                    ucuye.add(yeni);
                    String veri = cursor.getString(ixad)+" "+cursor.getString(ixsoyad);
                    isim.add(veri);
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(context,R.layout.support_simple_spinner_dropdown_item,isim);
                    arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    kisi.setAdapter(arrayAdapter);
                    cursor.moveToNext();
                }
                listgoster();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
    class veriCek implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             ucretUye at = ucuye.get(position);
             byte[] png = at.getFoto();
             Bitmap image = BitmapFactory.decodeByteArray(png,0,png.length);
             img.setImageBitmap(image);
             name.setText(at.getAd()+" "+at.getSoyad());
             pos = position;
             listgoster();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
    class kaydetVeri implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Date tarih = new Date();
            SimpleDateFormat now = new SimpleDateFormat("dd.MM.yyyy");
            String date = now.format(tarih);
            String miktar = ucretMiktar.getText().toString();
            ucretUye in = ucuye.get(pos);
            fragment5.database = openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
            fragment5.database.execSQL("CREATE TABLE IF NOT EXISTS ucret(ad VARCHAR, soyad VARCHAR, tc VARCHAR, tarih VARCHAR, miktar VARCHAR)");
            String query = "Insert Into ucret (ad, soyad, tc, tarih, miktar) VALUES (?,?,?,?,?)";
            SQLiteStatement statement = fragment5.database.compileStatement(query);
            statement.bindString(1,in.getAd());
            statement.bindString(2,in.getSoyad());
            statement.bindString(3,in.getTc());
            statement.bindString(4,date);
            statement.bindString(5,miktar);
            statement.execute();
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setTitle(in.getAd()+" "+in.getSoyad()+"'ın "+miktar+"₺ lik ödemesi alınmıştır");
            android.app.AlertDialog alert = builder.create();
            alert.show();
            ucretMiktar.setText("");
            listgoster();
        }
    }

    public void listgoster()
    {
        try{
            ucretUye fortc = ucuye.get(pos);
            String tc = fortc.getTc();
            fragment5.database = openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
            Cursor cursor = fragment5.database.rawQuery("Select tarih, miktar from ucret where tc = ?",new String[]{tc});
            int ixtarih = cursor.getColumnIndex("tarih");
            int ixmiktar = cursor.getColumnIndex("miktar");
            cursor.moveToFirst();
            listucret.clear();
            adapter.temizle();
            listView.setAdapter(adapter);
            while (cursor != null)
            {
                ayVeucret yeni = new ayVeucret(cursor.getString(ixtarih),cursor.getString(ixmiktar));
                listucret.add(yeni);
                cursor.moveToNext();
                System.out.println("1");
            }
            System.out.println("2");
            adapter = new cusadapucret(context,listucret);
            listView.setAdapter(adapter);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

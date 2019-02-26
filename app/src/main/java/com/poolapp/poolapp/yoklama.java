package com.poolapp.poolapp;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class yoklama extends AppCompatActivity {
    List<uyeYoklama> liste = new ArrayList<>();
    ListView listw;
    Context context = this;
    Spinner gun;
    Spinner saat;
    CustomAdapter adapter;
    Button yokOk;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yoklama);
        listw = findViewById(R.id.listw);
        gun = findViewById(R.id.gunler);
        saat = findViewById(R.id.saatler);
        yokOk = findViewById(R.id.yoklamaOK);
        fragment5.database = this.openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
        fragment5.database.execSQL("CREATE TABLE IF NOT EXISTS yoklama(tc VARCHAR, name VARCHAR, surname VARCHAR, gun VARCHAR, saat VARCHAR, tarih VARCHAR, varyok VARCHAR)");
        gun.setOnItemSelectedListener(new veriCek());
        saat.setOnItemSelectedListener(new veriCek());
        yokOk.setOnClickListener(new yokKaydet());
        adapter = new CustomAdapter(context, liste);
        listw.setAdapter(adapter);

    }
    class yokKaydet implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setMessage("Yoklamayı Kaydetmek İstediğinize Emin Misiniz? ")
                    .setCancelable(false)
                    .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //
                            try {
                                fragment5.database = openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
                                Date tarih = new Date();
                                SimpleDateFormat nowt = new SimpleDateFormat("dd.MM.yyyy");
                                String date = nowt.format(tarih);
                                for(int i=0; i<liste.size();i++)
                                {
                                    uyeYoklama now = liste.get(i);
                                    String query = "Insert Into yoklama (tc, name, surname, gun, saat, tarih, varyok) VALUES (?,?,?,?,?,?,?)";
                                    SQLiteStatement statement = fragment5.database.compileStatement(query);
                                    statement.bindString(1,now.getTc());
                                    statement.bindString(2,now.getAd());
                                    statement.bindString(3,now.getSoyad());
                                    statement.bindString(4,gun.getSelectedItem().toString());
                                    statement.bindString(5,saat.getSelectedItem().toString());
                                    statement.bindString(6,date);
                                    String yk = String.valueOf(now.getYoklama());
                                    statement.bindString(7,yk);
                                    statement.execute();
                                }

                            }
                            catch (Exception e){
                                e.printStackTrace();
                            }
                            //
                            System.out.println("kaydetti");
                            dialog.cancel();
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
    }
    class veriCek implements AdapterView.OnItemSelectedListener
    {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            try{
                String day = gun.getSelectedItem().toString();
                String hour = saat.getSelectedItem().toString();
                fragment5.database = openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
                Cursor cursor = fragment5.database.rawQuery("Select ad, soyad, tc from users where gun=? and saat=?",new String[]{day,hour});
                int ixad = cursor.getColumnIndex("ad");
                int ixsoyad = cursor.getColumnIndex("soyad");
                int ixtc = cursor.getColumnIndex("tc");
                cursor.moveToFirst();
                liste.clear();
                adapter.temizle();
                listw.setAdapter(adapter);

                while (cursor != null)
                {
                    uyeYoklama yeni = new uyeYoklama(cursor.getString(ixad),cursor.getString(ixsoyad),cursor.getString(ixtc));
                    liste.add(yeni);
                    cursor.moveToNext();
                }
                adapter = new CustomAdapter(context, liste);
                listw.setAdapter(adapter);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }


}

package com.poolapp.poolapp;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UyeSil extends AppCompatActivity {
    ListView sil_list;
    List<uyeYoklama> listVeri = new ArrayList<>();
    Context c = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uye_sil);
        sil_list = findViewById(R.id.sil_listview);

        fragment5.database = this.openOrCreateDatabase("PoolApp", MODE_PRIVATE, null);
        Cursor cursor = fragment5.database.rawQuery("Select ad, soyad, tc from users", null);
        int ixad = cursor.getColumnIndex("ad");
        int ixsoyad = cursor.getColumnIndex("soyad");
        int ixtc = cursor.getColumnIndex("tc");
        if (cursor.moveToFirst()) {

            cursor.moveToFirst();
            for (int i = 0; i < cursor.getCount(); i++) {
                uyeYoklama yeni = new uyeYoklama(cursor.getString(ixad), cursor.getString(ixsoyad), cursor.getString(ixtc));
                listVeri.add(yeni);
                cursor.moveToNext();
            }
            CustomAdapter2 adp = new CustomAdapter2(c, listVeri);
            sil_list.setAdapter(adp);

            sil_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                    final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
                    builder.setMessage("Üyeyi Silmek İstediğinize Emin Misiniz? ")
                            .setCancelable(false)
                            .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    int x = fragment5.database.delete("users", "tc = ?",new String[]{listVeri.get(position).getTc()});
                                    dialog.cancel();
                                    finish();
                                    startActivity(getIntent());
                                }
                            })
                            .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                    android.app.AlertDialog alert = builder.create();
                    alert.show();

                }
            });
        }
    }
}
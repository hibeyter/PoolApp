package com.poolapp.poolapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class GuncelleLİst extends AppCompatActivity {

    ListView guncelle_listview;
    List<uyeYoklama> listGuncelle = new ArrayList<>();
    Context c = this;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ogrenci_list);
        guncelle_listview = findViewById(R.id.ogrenci_listview);
        fragment5.database = this.openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
        Cursor cursor = fragment5.database.rawQuery("Select ad, soyad, tc from users",null);
        int ixad = cursor.getColumnIndex("ad");
        int ixsoyad = cursor.getColumnIndex("soyad");
        int ixtc = cursor.getColumnIndex("tc");
        if (cursor.moveToFirst()) {

            cursor.moveToFirst();
            for (int i = 0; i < cursor.getCount(); i++) {
                uyeYoklama yeni = new uyeYoklama(cursor.getString(ixad), cursor.getString(ixsoyad), cursor.getString(ixtc));
                listGuncelle.add(yeni);
                cursor.moveToNext();
            }
            CustomAdapter2 adp = new CustomAdapter2(c, listGuncelle);
            guncelle_listview.setAdapter(adp);

            guncelle_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(c, uyeGuncelle.class);
                    intent.putExtra("tc", listGuncelle.get(position).getTc());
                    c.startActivity(intent);
                }
            });
        }
    }
}

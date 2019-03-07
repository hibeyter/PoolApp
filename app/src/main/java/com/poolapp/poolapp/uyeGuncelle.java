package com.poolapp.poolapp;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class uyeGuncelle extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Context context = this;
    public static users us;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uye_guncelle);
        final String tc = getIntent().getExtras().getString("tc");
        tabLayout = findViewById(R.id.tablayout_guncelle);
        viewPager = findViewById(R.id.View_pager_guncelle);
        viewPager.setAdapter(new Fragments_Guncelle(getSupportFragmentManager(), context));
        tabLayout.setupWithViewPager(viewPager);

        fragment5.database = this.openOrCreateDatabase("PoolApp", MODE_PRIVATE, null);
        Cursor cursor = fragment5.database.rawQuery("Select ad, soyad,date ,tc,cinsiyet,ameslek,bmeslek, okul, sinif, tel,\" +\n" +
                "\"mail, adres, yakintel, evtel, isadresi, kangrb, saglik, ameliyat, ilac, boy, kilo, koluzunlugu,\" +\n" +
                "\"bacak, omuz, gun, saat, yuzme, antrenor, lisansno, yarismalar from users where tc = ?", new String[]{tc});
        int ixad = cursor.getColumnIndex("ad");
        int ixsoyad = cursor.getColumnIndex("soyad");
        int ixtc = cursor.getColumnIndex("tc");
        int ixdate = cursor.getColumnIndex("date");
        int ixcins = cursor.getColumnIndex("cinsiyet");
        int ixameslek = cursor.getColumnIndex("ameslek");
        int bmeslek = cursor.getColumnIndex("bmeslek");
        int ixokul = cursor.getColumnIndex("okul");
        int ixsinif = cursor.getColumnIndex("sinif");
        int ixtel = cursor.getColumnIndex("tel");
        int ixmail = cursor.getColumnIndex("mail");
        int ixadres = cursor.getColumnIndex("adres");
        int ixyakintel = cursor.getColumnIndex("yakintel");
        int ixevtel = cursor.getColumnIndex("evtel");
        int ixisadresi = cursor.getColumnIndex("isadresi");
        int ixkangrb = cursor.getColumnIndex("kangrb");
        int ixsaglik = cursor.getColumnIndex("saglik");
        int ixameliyat = cursor.getColumnIndex("ameliyat");
        int ixilac = cursor.getColumnIndex("ilac");
        int ixboy = cursor.getColumnIndex("boy");
        int ixkilo = cursor.getColumnIndex("kilo");
        int ixkoluzunlugu = cursor.getColumnIndex("koluzunlugu");
        int ixbacak = cursor.getColumnIndex("bacak");
        int ixomuz = cursor.getColumnIndex("omuz");
        int ixgun = cursor.getColumnIndex("gun");
        int ixsaat = cursor.getColumnIndex("saat");
        int ixyuzme = cursor.getColumnIndex("yuzme");
        int ixantrenor = cursor.getColumnIndex("antrenor");
        int ixlisansno = cursor.getColumnIndex("lisansno");
        int ixyarismalar = cursor.getColumnIndex("yarismalar");

        if (cursor.moveToFirst()) {

            try {
                cursor.moveToFirst();
                us = new users(cursor.getString(ixad), cursor.getString(ixsoyad), cursor.getString(ixtc), cursor.getString(ixdate), cursor.getString(ixcins), cursor.getString(ixameslek), cursor.getString(bmeslek),
                        cursor.getString(ixokul), cursor.getString(ixsinif), cursor.getString(ixtel), cursor.getString(ixmail), cursor.getString(ixadres), cursor.getString(ixyakintel),
                        cursor.getString(ixevtel), cursor.getString(ixisadresi), cursor.getString(ixkangrb), cursor.getString(ixsaglik), cursor.getString(ixameliyat), cursor.getString(ixilac),
                        cursor.getString(ixboy), cursor.getString(ixkilo), cursor.getString(ixkoluzunlugu), cursor.getString(ixbacak), cursor.getString(ixomuz), cursor.getString(ixgun),
                        cursor.getString(ixsaat), cursor.getString(ixyuzme), cursor.getString(ixantrenor), cursor.getString(ixlisansno), cursor.getString(ixyarismalar));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                cursor.close();
            }

        }
    }
}

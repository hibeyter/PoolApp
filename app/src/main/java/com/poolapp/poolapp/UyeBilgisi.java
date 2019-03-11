package com.poolapp.poolapp;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class UyeBilgisi extends AppCompatActivity {
    TabLayout tabLayout_bilgi;
    ViewPager viewPager_bilgi;
    Context context = this;
    String tc;
    static List<ayVeucret> listucret;
    public static users u;
    public static List<uyeYoklama> uye;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listucret = new ArrayList<>();
        uye = new ArrayList<>();
        setContentView(R.layout.uye_bilgisi);
        tc = getIntent().getExtras().getString("tc");
        tabLayout_bilgi = findViewById(R.id.tablayout_bilgi);
        viewPager_bilgi = findViewById(R.id.View_pager_bilgi);
        viewPager_bilgi.setAdapter(new Fragments_Bilgi(getSupportFragmentManager(),context));
        tabLayout_bilgi.setupWithViewPager(viewPager_bilgi);
        listgoster();
        fragment5.database = this.openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
        Cursor cursor = fragment5.database.rawQuery("Select ad, soyad,date ,tc,cinsiyet,ameslek,bmeslek,okul, sinif, tel, mail, adres, yakintel, evtel, isadresi, kangrb, saglik, ameliyat, ilac, boy, kilo, koluzunlugu,bacak, omuz, gun, saat, yuzme, antrenor, lisansno, yarismalar from users where tc = ?",new String[]{tc});
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

            try{
                cursor.moveToFirst();
                u = new users(cursor.getString(ixad),cursor.getString(ixsoyad),cursor.getString(ixtc),cursor.getString(ixdate),cursor.getString(ixcins),cursor.getString(ixameslek),cursor.getString(bmeslek),
                        cursor.getString(ixokul), cursor.getString(ixsinif), cursor.getString(ixtel), cursor.getString(ixmail),cursor.getString(ixadres),cursor.getString(ixyakintel),
                        cursor.getString(ixevtel),cursor.getString(ixisadresi),cursor.getString(ixkangrb),cursor.getString(ixsaglik),cursor.getString(ixameliyat),cursor.getString(ixilac),
                        cursor.getString(ixboy),cursor.getString(ixkilo),cursor.getString(ixkoluzunlugu),cursor.getString(ixbacak),cursor.getString(ixomuz),cursor.getString(ixgun),
                        cursor.getString(ixsaat),cursor.getString(ixyuzme),cursor.getString(ixantrenor),cursor.getString(ixlisansno),cursor.getString(ixyarismalar));
            }
            catch (Exception e){
            e.printStackTrace();
            }
            finally {
                cursor.close();
            }
            if (!fragment5.database.isOpen()) {
                fragment5.database = this.openOrCreateDatabase("PoolApp", MODE_PRIVATE, null);
            }
               Cursor cs = fragment5.database.rawQuery("Select name, surname, tarih, varyok from yoklama where tc=? ",new String[]{tc});
            int ixad2 = cs.getColumnIndex("name");
            int ixsoyad2 = cs.getColumnIndex("surname");
            int ixtarih = cs.getColumnIndex("tarih");
            int ixvaryok = cs.getColumnIndex("varyok");
            if (cs.moveToFirst()){
                try{
                    cs.moveToFirst();
                    for (int j=0;j<cs.getCount();j++){
                        uye.add(new uyeYoklama(cs.getString(ixad2),
                                cs.getString(ixsoyad2),
                                cs.getString(ixtarih),
                                cs.getString(ixvaryok)));//verileri nesneye atar ve nesneyi diziye ekler. Bilgi_2 de customadapter 3 tanımla ve onun içine burdaki diziyi ver. Zaten static. sonra listviewin set adapter özelliğine de customadapter3 ü ver. tamamdır
                        cs.moveToNext();
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
            cs.close();


        }

    }
    public void listgoster()
    {
        try{
            fragment5.database = this.openOrCreateDatabase("PoolApp", MODE_PRIVATE, null);
            Cursor cursor = fragment5.database.rawQuery("Select tarih, miktar from ucret where tc = ?",new String[]{tc});
            int ixtarih = cursor.getColumnIndex("tarih");
            int ixmiktar = cursor.getColumnIndex("miktar");
            cursor.moveToFirst();
            while (cursor != null)
            {
                ayVeucret yeni = new ayVeucret(cursor.getString(ixtarih),cursor.getString(ixmiktar));
                listucret.add(yeni);
                cursor.moveToNext();
                System.out.println("1");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}


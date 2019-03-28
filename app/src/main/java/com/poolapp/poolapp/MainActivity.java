package com.poolapp.poolapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final int Kontrol = 3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        fragment5.database = openOrCreateDatabase("PoolApp",MODE_PRIVATE,null);
        fragment5.database.execSQL("CREATE TABLE IF NOT EXISTS users(img BLOB, ad VARCHAR, soyad VARCHAR," +
                "tc VARCHAR,date VARCHAR ,cinsiyet VARCHAR, ameslek VARCHAR, bmeslek VARCHAR, okul VARCHAR, sinif VARCHAR, " +
                "tel VARCHAR, mail VARCHAR, adres VARCHAR, yakintel VARCHAR, evtel VARCHAR, isadresi VARCHAR," +
                "kangrb VARCHAR, saglik VARCHAR, ameliyat VARCHAR, ilac VARCHAR, boy VARCHAR, kilo VARCHAR, " +
                "koluzunlugu VARCHAR, bacak VARCHAR, omuz VARCHAR, gun VARCHAR, saat VARCHAR, yuzme VARCHAR, " +
                "antrenor VARCHAR, lisansno VARCHAR, yarismalar VARCHAR)");
        fragment5.database.execSQL("CREATE TABLE IF NOT EXISTS yoklama(tc VARCHAR, name VARCHAR, surname VARCHAR, gun VARCHAR, saat VARCHAR, tarih VARCHAR, varyok VARCHAR)");
        fragment5.database.execSQL("CREATE TABLE IF NOT EXISTS ucret(ad VARCHAR, soyad VARCHAR, tc VARCHAR, tarih VARCHAR, miktar VARCHAR)");
        Button btn_yeni_uye =  findViewById(R.id.btn_yeni_uye);
        btn_yeni_uye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, yeni_uye.class);
                startActivity(intent);
            }
        });

        Button btn_uyebigisi =  findViewById(R.id.btn_uyebilgisi);
        btn_uyebigisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OgrenciList.class);
                startActivity(intent);
            }
        });

        Button btn_yoklama =  findViewById(R.id.btn_yoklama);
        btn_yoklama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, yoklama.class);
                startActivity(intent);
            }
        });
        Button btn_ucret =  findViewById(R.id.btn_ucret);
        btn_ucret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ucret.class);
                startActivity(intent);
            }
        });
        Button btn_sil = findViewById(R.id.btn_uye_sil);
        btn_sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,UyeSil.class);
                startActivity(intent);
            }
        });
        Button btn_guncelle = findViewById(R.id.btn_uye_guncelle);
        btn_guncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GuncelleLİst.class);
                startActivity(intent);
            }
        });
    }
    public  void ayaragit(View view){
        Intent intent = new Intent(MainActivity.this,SendDbXls.class);
        startActivity(intent);
    }
    public  boolean kontrol(){
        int perCamera = ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA);
        List<String> izinler = new ArrayList<>();
        if(perCamera != PackageManager.PERMISSION_GRANTED){
            izinler.add(Manifest.permission.CAMERA);
        }
        if(!izinler.isEmpty())
        {
            ActivityCompat.requestPermissions(this,izinler.toArray(new String[izinler.size()]),Kontrol);
            return false;
        }
        return true;
    }
}
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
        Button btn_yeni_uye =  findViewById(R.id.btn_yeni_uye);
        btn_yeni_uye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, yeni_uye.class);
                startActivity(intent);
            }
        });

        Button btn_antrenor =  findViewById(R.id.btn_antrenor);
        btn_antrenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, antrenor.class);
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
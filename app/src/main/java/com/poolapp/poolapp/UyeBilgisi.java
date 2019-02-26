package com.poolapp.poolapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class UyeBilgisi extends AppCompatActivity {
    TabLayout tabLayout_bilgi;
    ViewPager viewPager_bilgi;
    Context context = this;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uye_bilgisi);
        final String tc = getIntent().getExtras().getString("tc");
        tabLayout_bilgi = findViewById(R.id.tablayout_bilgi);
        viewPager_bilgi = findViewById(R.id.View_pager_bilgi);
        viewPager_bilgi.setAdapter(new Fragments_Bilgi(getSupportFragmentManager(),context));
        tabLayout_bilgi.setupWithViewPager(viewPager_bilgi);
        Toast.makeText(context,tc,Toast.LENGTH_LONG).show();
    }
}

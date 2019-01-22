package com.poolapp.poolapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class yeni_uye extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Context context = this;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeniuye);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.View_pager);
        viewPager.setAdapter(new Fragments(getSupportFragmentManager(),context));
        tabLayout.setupWithViewPager(viewPager);


    }
}

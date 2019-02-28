package com.poolapp.poolapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Fragments_Bilgi extends FragmentPagerAdapter {
    private String[] tab = new String[]{"Üye Bilgileri","Yoklama"};
    Context context;

    Fragments_Bilgi(FragmentManager fmm, Context contextt){
        super(fmm);
        this.context=contextt;
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
           Bilgi_1 bilgi_1 = new Bilgi_1();
           return bilgi_1;
        }
        else{
          Bilgi_2 bilgi_2 = new Bilgi_2();
          return bilgi_2;
        }
    }

    @Override
    public int getCount() {
        return tab.length;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }

}

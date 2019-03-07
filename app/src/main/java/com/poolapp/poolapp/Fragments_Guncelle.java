package com.poolapp.poolapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Fragments_Guncelle extends FragmentPagerAdapter {
    private String[] gun = new String[]{"Kişisel Bilgiler","Kişisel Bilgiler","İletişim Bilgileri","Sağlık Bilgileri","Vücut Bilgileri","Yüzme Bilgileri"};
    Context context;

   Fragments_Guncelle(FragmentManager fm, Context context){
        super(fm);
        this.context=context;
    }
    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new guncelle_1();
        }
        else if(i==1){
            return new guncelle_2();
        }
        else if(i==2){
            return new guncelle_3();
        }
        else if(i==3){
            return new guncelle_4();
        }
        else if(i==4){
            return new guncelle_5();
        }
        else {
            return new guncelle_6();
        }
    }

    @Override
    public int getCount() {
        return gun.length;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return gun[position];
    }
}

package com.poolapp.poolapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Fragments extends FragmentPagerAdapter {
    private String[] table = new String[]{"Kişisel Bilgiler","Kişisel Bilgiler 2 ","İletişim Bilgileri","Sağlık Bilgileri","Vücut Bilgileri","Yüzme Bilgileri"};
    Context context;

    Fragments(FragmentManager fm, Context context){
        super(fm);
        this.context=context;
    }


    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new fragment1();
        }
        else if(position==1){
            return new fragment6();
        }
        else if(position==2){
            return new fragment2();
        }
        else if(position==3){
            return new fragment3();
        }
        else if(position==4){
            return new fragment4();
        }
        else {
            return new fragment5();
        }

    }
    @Override
    public int getCount() {
        return table.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return table[position];
    }

}

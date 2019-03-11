package com.poolapp.poolapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter3 extends BaseAdapter {
    List<uyeYoklama> bilgiyoklama;
    LayoutInflater inflater;
    Context context;

    public CustomAdapter3 (Context context, List<uyeYoklama> bilgiyoklama) {
        this.context = context;
        this.bilgiyoklama = bilgiyoklama;
    }
    @Override
    public int getCount() {
        return bilgiyoklama.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = LayoutInflater.from(context);
        View bilgiList = inflater.inflate(R.layout.bilgi_yoklama, null);
        final TextView bilgiadsoyad = bilgiList.findViewById(R.id.bilgiadsoyad);
        final TextView bilgitarih = bilgiList.findViewById(R.id.bilgitarih);
        final TextView bilgivaryok = bilgiList.findViewById(R.id.bilgivaryok);
        uyeYoklama uye = bilgiyoklama.get(position);
        bilgiadsoyad.setText(uye.getAd()+" "+uye.getSoyad()+" ");
        bilgitarih.setText(uye.getTarih());
        if (uye.getYoklama().equals("1")){
            bilgivaryok.setText("VAR");
        }
        else {
            bilgivaryok.setText("YOK");
        }


        return bilgiList;
    }

}

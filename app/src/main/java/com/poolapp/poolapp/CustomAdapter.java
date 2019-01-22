package com.poolapp.poolapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<uyeYoklama> liste = new ArrayList<>();
    LayoutInflater inflater;
    Context context;
    public CustomAdapter(Context context, List<uyeYoklama> liste) {
        this.context = context;
        this.liste = liste;
    }

    @Override
    public int getCount() {
        return liste.size();
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
        View yoklist =  inflater.inflate(R.layout.yoklamalist,null);
        final TextView yoklamaisim = yoklist.findViewById(R.id.yoklama_isim);
        Date tarih = new Date();
        SimpleDateFormat now = new SimpleDateFormat("dd.MM.yyyy");
        final CheckBox yoklamatarih = yoklist.findViewById(R.id.yoklama_tarih);
        final uyeYoklama uye = liste.get(position);
        yoklamaisim.setText(uye.getAd()+" "+uye.getSoyad());
        yoklamatarih.setText(now.format(tarih));
        yoklamatarih.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(yoklamatarih.isChecked())
                {
                    uye.setYoklama(1);
                }
                else
                {
                    uye.setYoklama(0);
                }
            }
        });
        return yoklist;
    }
    public void temizle()
    {
        liste.clear();
    }
}

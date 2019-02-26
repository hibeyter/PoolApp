package com.poolapp.poolapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter2 extends BaseAdapter {
    List<uyeYoklama> liste_ogr = new ArrayList<>();
    LayoutInflater inflater;
    Context context;
    public CustomAdapter2(Context context, List<uyeYoklama> liste) {
        this.context = context;
        this.liste_ogr = liste;
    }

    @Override
    public int getCount() {
        return liste_ogr.size();
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
        View ogr_list =  inflater.inflate(R.layout.ogr_list_satir,null);
        TextView satir_ad = ogr_list.findViewById(R.id.satir_ad);
        final uyeYoklama uye = liste_ogr.get(position);
        satir_ad.setText(uye.getAd()+" "+uye.getSoyad());
        return ogr_list;
    }
   /* public void temizle()
    {
        liste_ogr.clear();
    }*/
}

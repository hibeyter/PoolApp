package com.poolapp.poolapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class cusadapucret extends BaseAdapter {
    List<ayVeucret> listucret = new ArrayList<>();
    LayoutInflater inflater;
    Context context;

    public cusadapucret(Context context, List<ayVeucret> listucret) {
        this.context = context;
        this.listucret = listucret;
    }

    @Override
    public int getCount() {
        return listucret.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = LayoutInflater.from(context);
        View ucretlist =  inflater.inflate(R.layout.ucretlist,null);
        TextView ay = ucretlist.findViewById(R.id.ay);
        TextView miktar = ucretlist.findViewById(R.id.miktar);
        ayVeucret ayu = listucret.get(position);
        ay.setText(ayu.getAy());
        miktar.setText(ayu.getUcret());
        return ucretlist;
    }
    public void temizle()
    {
        listucret.clear();
    }
}

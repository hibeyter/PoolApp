package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class guncelle_1 extends Fragment {

    public static ImageView guncel_img;
    public static EditText guncel_ad;
    public static EditText guncel_soyad;
    public static EditText guncel_tc;
    public static TextView guncel_tarih;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment1_layout, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        guncel_img = getActivity().findViewById(R.id.imageView);
        guncel_ad = getActivity().findViewById(R.id.ad_edit);
        guncel_soyad = getActivity().findViewById(R.id.soyad_edit);
        guncel_tc = getActivity().findViewById(R.id.tc_edit);
        guncel_tarih = getActivity().findViewById(R.id.date_txt);

        guncel_ad.setText(uyeGuncelle.us.getNAME());
        guncel_soyad.setText(uyeGuncelle.us.getSURNAME());
        guncel_tc.setText(uyeGuncelle.us.getTC());
        guncel_tarih.setText(uyeGuncelle.us.getDATE());
    }
}

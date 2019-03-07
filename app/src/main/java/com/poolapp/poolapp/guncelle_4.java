package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class guncelle_4 extends Fragment {

    public static EditText guncel_saglikproblemi;
    public static EditText guncel_ameliyat;
    public static EditText guncel_ilac;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment3_layout, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        guncel_saglikproblemi = getActivity().findViewById(R.id.saglikproblemi_edit);
        guncel_ameliyat = getActivity().findViewById(R.id.ameliyat_edit);
        guncel_ilac = getActivity().findViewById(R.id.ilac_edit);

        guncel_saglikproblemi.setText(uyeGuncelle.us.getHEALTHPROBLEM());
        guncel_ameliyat.setText(uyeGuncelle.us.getSURGERY());
        guncel_ilac.setText(uyeGuncelle.us.getDRUG());
    }
}

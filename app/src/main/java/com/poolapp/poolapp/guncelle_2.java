package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import javax.sql.StatementEvent;

public class guncelle_2 extends Fragment {
    public static Spinner guncel_cinsiyet;
    public static EditText guncel_annemeslek;
    public static EditText guncel_babameslek;
    public static EditText guncel_okul;
    public static EditText guncel_sinif;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment6_layout, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //guncel_cinsiyet = getActivity().findViewById(R.id.cinsiyet);
        guncel_annemeslek = getActivity().findViewById(R.id.annemeslek_edit);
        guncel_babameslek = getActivity().findViewById(R.id.babameslek_edit);
        guncel_okul = getActivity().findViewById(R.id.okul_edit);
        guncel_sinif = getActivity().findViewById(R.id.sinif_edit);


        guncel_annemeslek.setText(uyeGuncelle.us.getMOMJOB());
        guncel_babameslek.setText(uyeGuncelle.us.getDADJOB());
        guncel_okul.setText(uyeGuncelle.us.getSCHOOL());
        guncel_sinif.setText(uyeGuncelle.us.getCLASS());
    }
}

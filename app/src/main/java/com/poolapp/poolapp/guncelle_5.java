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

public class guncelle_5 extends Fragment {

    public static EditText guncel_boy;
    public static EditText guncel_kilo;
    public static EditText guncel_kol;
    public static EditText guncel_bacak;
    public static EditText guncel_omuz;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment4_layout, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        guncel_boy = getActivity().findViewById(R.id.boy_edit);
        guncel_kilo = getActivity().findViewById(R.id.kilo_edit);
        guncel_kol = getActivity().findViewById(R.id.kolboyu_edit);
        guncel_bacak = getActivity().findViewById(R.id.bacak_edit);
        guncel_omuz = getActivity().findViewById(R.id.omuz_edit);

        guncel_boy.setText(uyeGuncelle.us.getLENGTH());
        guncel_kilo.setText(uyeGuncelle.us.getWEIGHT());
        guncel_kol.setText(uyeGuncelle.us.getARM());
        guncel_bacak.setText(uyeGuncelle.us.getLEG());
        guncel_omuz.setText(uyeGuncelle.us.getSHOULDER());
    }
}

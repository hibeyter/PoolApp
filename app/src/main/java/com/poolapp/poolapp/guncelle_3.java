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

public class guncelle_3 extends Fragment {

    public static EditText guncel_telno;
    public static EditText guncel_mail;
    public static EditText guncel_adres;
    public static EditText guncel_yakintel;
    public static EditText guncel_evtel;
    public static EditText guncel_isadresi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment2_layout, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        guncel_telno = getActivity().findViewById(R.id.telno_edit);
        guncel_mail = getActivity().findViewById(R.id.mail_edit);
        guncel_adres = getActivity().findViewById(R.id.adres_edit);
        guncel_yakintel = getActivity().findViewById(R.id.yakintelno_edit);
        guncel_evtel = getActivity().findViewById(R.id.evtelno_edit);
        guncel_isadresi = getActivity().findViewById(R.id.isadresi_edit);

        guncel_telno.setText(uyeGuncelle.us.getTEL());
        guncel_mail.setText(uyeGuncelle.us.getMAIL());
        guncel_adres.setText(uyeGuncelle.us.getADRESS());
        guncel_yakintel.setText(uyeGuncelle.us.getYAKINTEL());
        guncel_evtel.setText(uyeGuncelle.us.getHOMETEL());
        guncel_isadresi.setText(uyeGuncelle.us.getJOBADRESS());
    }
}

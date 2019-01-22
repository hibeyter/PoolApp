package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

public class fragment2 extends Fragment {
    //
    static EditText telno_edit;
    static EditText mail_edit;
    static EditText adres_edit;
    static EditText yakintelno_edit;
    static EditText evtelno_edit;
    static EditText isadresi_edit;
    //
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        telno_edit = view.findViewById(R.id.telno_edit);
        mail_edit = view.findViewById(R.id.mail_edit);
        adres_edit = view.findViewById(R.id.adres_edit);
        yakintelno_edit = view.findViewById(R.id.yakintelno_edit);
        evtelno_edit = view.findViewById(R.id.evtelno_edit);
        isadresi_edit = view.findViewById(R.id.isadresi_edit);
        return view;
    }
}

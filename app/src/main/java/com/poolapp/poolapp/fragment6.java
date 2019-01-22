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

public class fragment6 extends Fragment {
    //
    static Spinner cinsiyet;
    static EditText annemeslek_edit;
    static EditText babameslek_edit;
    static EditText okul_edit;
    static EditText sinif_edit;
    //
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment6_layout,container,false);
        cinsiyet = view.findViewById(R.id.cinsiyet);
        annemeslek_edit = view.findViewById(R.id.annemeslek_edit);
        babameslek_edit = view.findViewById(R.id.babameslek_edit);
        okul_edit = view.findViewById(R.id.okul_edit);
        sinif_edit = view.findViewById(R.id.sinif_edit);
        return view;
    }
}

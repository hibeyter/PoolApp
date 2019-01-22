package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class fragment4 extends Fragment {
    //
    static EditText boy_edit;
    static EditText kilo_edit;
    static EditText kolboyu_edit;
    static EditText bacak_edit;
    static EditText omuz_edit;
    //
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4_layout, container, false);
        boy_edit = view.findViewById(R.id.boy_edit);
        kilo_edit = view.findViewById(R.id.kilo_edit);
        kolboyu_edit = view.findViewById(R.id.kolboyu_edit);
        bacak_edit = view.findViewById(R.id.bacak_edit);
        omuz_edit = view.findViewById(R.id.omuz_edit);
        return view;
    }
}

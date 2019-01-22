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

public class fragment3 extends Fragment {
    //
    static Spinner kangr;
    static EditText saglikproblemi_edit;
    static EditText ameliyat_edit;
    static EditText ilac_edit;
    //
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout,container,false);
        kangr = view.findViewById(R.id.kangr);
        saglikproblemi_edit = view.findViewById(R.id.saglikproblemi_edit);
        ameliyat_edit = view.findViewById(R.id.ameliyat_edit);
        ilac_edit = view.findViewById(R.id.ilac_edit);
        return view;
    }
}

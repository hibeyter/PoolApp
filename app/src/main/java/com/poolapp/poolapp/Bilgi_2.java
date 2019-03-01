package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Bilgi_2 extends Fragment {
    ListView ls;
    CustomAdapter3 ca;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bilgi_2, container, false);


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ls = getActivity().findViewById(R.id.ls2);
        System.out.println(UyeBilgisi.uye.size());
        ca = new CustomAdapter3(getContext(),UyeBilgisi.uye);
        ls.setAdapter(ca);
    }
}


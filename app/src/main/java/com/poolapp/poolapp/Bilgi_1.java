package com.poolapp.poolapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Bilgi_1 extends Fragment {
    public static ImageView bilgi_img;
    public static TextView bilgi_ad;
    public static TextView bilgi_soyad;
    public static TextView bilgi_tc;
    public static TextView bilgi_tarih;
    public static TextView bilgi_cinsiyet;
    public static TextView bilgi_annemeslek;
    public static TextView bilgi_babameslek;
    public static TextView bilgi_okul;
    public static TextView bilgi_sinif;
    public static TextView bilgi_telno;
    public static TextView bilgi_mail;
    public static TextView bilgi_adres;
    public static TextView bilgi_yakintel;
    public static TextView bilgi_evtel;
    public static TextView bilgi_isadresi;
    public static TextView bilgi_kangrubu;
    public static TextView bilgi_saglikproblemi;
    public static TextView bilgi_ameliyat;
    public static TextView bilgi_ilac;
    public static TextView bilgi_boy;
    public static TextView bilgi_kilo;
    public static TextView bilgi_kol;
    public static TextView bilgi_bacak;
    public static TextView bilgi_omuz;
    public static TextView bilgi_geldigigun;
    public static TextView bilgi_geldigisaat;
    public static TextView bilgi_yuzme;
    public static TextView bilgi_antrenor;
    public static TextView bilgi_lisansno;
    public static TextView bilgi_yaris;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bilgi_1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bilgi_img = getActivity().findViewById(R.id.bilgi_img);
        bilgi_ad = getActivity().findViewById(R.id.bilgi_ad);
        bilgi_soyad = getActivity().findViewById(R.id.bilgi_soyad);
        bilgi_tc = getActivity().findViewById(R.id.bilgi_tc);
        bilgi_tarih = getActivity().findViewById(R.id.bilgi_tarih);
        bilgi_cinsiyet = getActivity().findViewById(R.id.bilgi_cinsiyet);
        bilgi_annemeslek = getActivity().findViewById(R.id.bilgi_annemeslek);
        bilgi_babameslek = getActivity().findViewById(R.id.bilgi_babameslek);
        bilgi_okul = getActivity().findViewById(R.id.bilgi_okul);
        bilgi_sinif = getActivity().findViewById(R.id.bilgi_sinif);
        bilgi_telno = getActivity().findViewById(R.id.bilgi_telno);
        bilgi_mail = getActivity().findViewById(R.id.bilgi_mail);
        bilgi_adres = getActivity().findViewById(R.id.bilgi_adres);
        bilgi_yakintel = getActivity().findViewById(R.id.bilgi_yakintel);
        bilgi_evtel = getActivity().findViewById(R.id.bilgi_evtel);
        bilgi_isadresi = getActivity().findViewById(R.id.bilgi_isadres);
        bilgi_kangrubu = getActivity().findViewById(R.id.bilgi_kangrubu);
        bilgi_saglikproblemi = getActivity().findViewById(R.id.bilgi_saglikproblem);
        bilgi_ameliyat = getActivity().findViewById(R.id.bilgi_ameliyat);
        bilgi_ilac = getActivity().findViewById(R.id.bilgi_ilac);
        bilgi_boy = getActivity().findViewById(R.id.bilgi_boy);
        bilgi_kilo = getActivity().findViewById(R.id.bilgi_kilo);
        bilgi_kol = getActivity().findViewById(R.id.bilgi_kol);
        bilgi_bacak = getActivity().findViewById(R.id.bilgi_bacak);
        bilgi_omuz = getActivity().findViewById(R.id.bilgi_omuz);
        bilgi_geldigigun = getActivity().findViewById(R.id.bilgi_geldigigun);
        bilgi_geldigisaat = getActivity().findViewById(R.id.bilgi_geldigisaat);
        bilgi_yuzme = getActivity().findViewById(R.id.bilgi_yuzme);
        bilgi_antrenor = getActivity().findViewById(R.id.bilgi_antrenor);
        bilgi_lisansno = getActivity().findViewById(R.id.bilgi_lisansno);
        bilgi_yaris = getActivity().findViewById(R.id.bilgi_yarislar);

        bilgi_ad.setText(UyeBilgisi.u.getNAME());
        bilgi_soyad.setText(UyeBilgisi.u.getSURNAME());
        bilgi_tc.setText(UyeBilgisi.u.getTC());
        bilgi_tarih.setText(UyeBilgisi.u.getDATE());
        bilgi_cinsiyet.setText(UyeBilgisi.u.getSEX());
        bilgi_annemeslek.setText(UyeBilgisi.u.getMOMJOB());
        bilgi_babameslek.setText(UyeBilgisi.u.getDADJOB());
        bilgi_okul.setText(UyeBilgisi.u.getSCHOOL());
        bilgi_sinif.setText(UyeBilgisi.u.getCLASS());
        bilgi_telno.setText(UyeBilgisi.u.getTEL());
        bilgi_mail.setText(UyeBilgisi.u.getMAIL());
        bilgi_adres.setText(UyeBilgisi.u.getADRESS());
        bilgi_yakintel.setText(UyeBilgisi.u.getYAKINTEL());
        bilgi_evtel.setText(UyeBilgisi.u.getHOMETEL());
        bilgi_isadresi.setText(UyeBilgisi.u.getJOBADRESS());
        bilgi_kangrubu.setText(UyeBilgisi.u.getBLOODTYPE());
        bilgi_saglikproblemi.setText(UyeBilgisi.u.getHEALTHPROBLEM());
        bilgi_ameliyat.setText(UyeBilgisi.u.getSURGERY());
        bilgi_ilac.setText(UyeBilgisi.u.getDRUG());
        bilgi_boy.setText(UyeBilgisi.u.getLENGTH());
        bilgi_kilo.setText(UyeBilgisi.u.getWEIGHT());
        bilgi_kol.setText(UyeBilgisi.u.getARM());
        bilgi_bacak.setText(UyeBilgisi.u.getLEG());
        bilgi_omuz.setText(UyeBilgisi.u.getSHOULDER());
        bilgi_geldigigun.setText(UyeBilgisi.u.getDAY());
        bilgi_geldigisaat.setText(UyeBilgisi.u.getHOUR());
        bilgi_yuzme.setText(UyeBilgisi.u.getSWIMINF());
        bilgi_antrenor.setText(UyeBilgisi.u.getANTRENOR());
        bilgi_lisansno.setText(UyeBilgisi.u.getLICENCE());
        bilgi_yaris.setText(UyeBilgisi.u.getRACINGS());
    }
}

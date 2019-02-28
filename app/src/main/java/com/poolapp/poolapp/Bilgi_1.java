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
    ImageView bilgi_img;
    TextView bilgi_ad;
    TextView bilgi_soyad;
    TextView bilgi_tc;
    TextView bilgi_tarih;
    TextView bilgi_cinsiyet;
    TextView bilgi_annemeslek;
    TextView bilgi_babameslek;
    TextView bilgi_okul;
    TextView bilgi_sinif;
    TextView bilgi_telno;
    TextView bilgi_mail;
    TextView bilgi_adres;
    TextView bilgi_yakintel;
    TextView bilgi_evtel;
    TextView bilgi_isadresi;
    TextView bilgi_kangrubu;
    TextView bilgi_saglikproblemi;
    TextView bilgi_ameliyat;
    TextView bilgi_ilac;
    TextView bilgi_boy;
    TextView bilgi_kilo;
    TextView bilgi_kol;
    TextView bilgi_bacak;
    TextView bilgi_omuz;
    TextView bilgi_geldigigun;
    TextView bilgi_geldigisaat;
    TextView bilgi_yuzme;
    TextView bilgi_antrenor;
    TextView bilgi_lisansno;
    TextView bilgi_yaris;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vieww = inflater.inflate(R.layout.bilgi_1, container, false);
        bilgi_img = vieww.findViewById(R.id.bilgi_img);
        bilgi_ad = vieww.findViewById(R.id.bilgi_ad);
        bilgi_soyad = vieww.findViewById(R.id.bilgi_soyad);
        bilgi_tc = vieww.findViewById(R.id.bilgi_tc);
        bilgi_tarih = vieww.findViewById(R.id.bilgi_tarih);
        bilgi_cinsiyet = vieww.findViewById(R.id.bilgi_cinsiyet);
        bilgi_annemeslek = vieww.findViewById(R.id.bilgi_annemeslek);
        bilgi_babameslek = vieww.findViewById(R.id.bilgi_babameslek);
        bilgi_okul = vieww.findViewById(R.id.bilgi_okul);
        bilgi_sinif = vieww.findViewById(R.id.bilgi_sinif);
        bilgi_telno = vieww.findViewById(R.id.bilgi_telno);
        bilgi_mail = vieww.findViewById(R.id.bilgi_mail);
        bilgi_adres = vieww.findViewById(R.id.bilgi_adres);
        bilgi_yakintel = vieww.findViewById(R.id.bilgi_yakintel);
        bilgi_evtel = vieww.findViewById(R.id.bilgi_evtel);
        bilgi_isadresi = vieww.findViewById(R.id.bilgi_isadres);
        bilgi_kangrubu = vieww.findViewById(R.id.bilgi_kangrubu);
        bilgi_saglikproblemi = vieww.findViewById(R.id.bilgi_saglikproblem);
        bilgi_ameliyat = vieww.findViewById(R.id.bilgi_ameliyat);
        bilgi_ilac = vieww.findViewById(R.id.bilgi_ilac);
        bilgi_boy = vieww.findViewById(R.id.bilgi_boy);
        bilgi_kilo = vieww.findViewById(R.id.bilgi_kilo);
        bilgi_kol = vieww.findViewById(R.id.bilgi_kol);
        bilgi_bacak = vieww.findViewById(R.id.bilgi_bacak);
        bilgi_omuz = vieww.findViewById(R.id.bilgi_omuz);
        bilgi_geldigigun = vieww.findViewById(R.id.bilgi_geldigigun);
        bilgi_geldigisaat = vieww.findViewById(R.id.bilgi_geldigisaat);
        bilgi_yuzme = vieww.findViewById(R.id.bilgi_yuzme);
        bilgi_antrenor = vieww.findViewById(R.id.bilgi_antrenor);
        bilgi_lisansno = vieww.findViewById(R.id.bilgi_lisansno);
        bilgi_yaris = vieww.findViewById(R.id.bilgi_yarislar);

        return vieww;
    }

}

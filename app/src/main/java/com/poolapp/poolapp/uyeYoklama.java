package com.poolapp.poolapp;

public class uyeYoklama {
    String tc;
    String ad;
    String soyad;
    String tarih;
    int yoklama;

    public uyeYoklama(String ad, String soyad, String tc) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getYoklama() {
        return yoklama;
    }

    public void setYoklama(int yoklama) {
        this.yoklama = yoklama;
    }
}

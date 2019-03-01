package com.poolapp.poolapp;

public class uyeYoklama {
    String tc;
    String ad;
    String soyad;
    String tarih;
    String yoklama;

    public uyeYoklama(String ad, String soyad, String tc) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
    }

    public uyeYoklama(String ad, String soyad, String tarih, String yoklama) {
        this.ad = ad;
        this.soyad = soyad;
        this.tarih = tarih;
        this.yoklama = yoklama;
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

    public String getYoklama() {
        return yoklama;
    }

    public void setYoklama(String yoklama) {
        this.yoklama = yoklama;
    }
}

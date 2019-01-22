package com.poolapp.poolapp;

public class ucretUye {
    String ad;
    String soyad;
    String tc;
    byte[] foto;

    public ucretUye(String ad, String soyad, String tc, byte[] foto) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.foto = foto;
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

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}

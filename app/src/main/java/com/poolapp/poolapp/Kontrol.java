package com.poolapp.poolapp;

public class Kontrol {
    public static boolean TcKontrol (String TcNo){
        if (TcNo==null) return false;

        if (TcNo.length()!=11) return  false;

        if(TcNo.charAt(0)=='0') return false;

        int tek_toplam=0,cift_toplam=0,moduainacak,toplam=0;

        int dizi[]=new int[11];

        for (int i = 0; i < 11; i++) {
            dizi[i]=Integer.valueOf(String.valueOf(TcNo.charAt(i)));
        }

        for (int i = 0; i <9 ; i++) {
            if ((i+1)%2==0) cift_toplam+= dizi[i];
            else tek_toplam+=dizi[i];
        }
        moduainacak=(tek_toplam*7)-cift_toplam;

        if (moduainacak%10!=dizi[9]) return false;

        for (int i = 0; i < 10; i++) {
            toplam+=dizi[i];
        }

        if (toplam%10!=dizi[10]) return false;


        return true ;
    }
    public  static  boolean Telkontrol(String tel){
        if (tel.length()<7||tel.length()>11) return false;
        return true;
    }

}

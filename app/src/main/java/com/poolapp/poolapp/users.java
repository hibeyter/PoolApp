package com.poolapp.poolapp;

import android.media.Image;

public class users {

    byte[] IMAGE;
    String NAME;
    String SURNAME;
    String TC;
    String DATE;
    String SEX;
    String MOMJOB;
    String DADJOB;
    String SCHOOL;
    String CLASS;
    String TEL;
    String MAIL;
    String ADRESS;
    String YAKINTEL;
    String HOMETEL;
    String JOBADRESS;
    String BLOODTYPE;
    String HEALTHPROBLEM;
    String SURGERY;
    String DRUG;
    String LENGTH;
    String WEIGHT;
    String ARM;
    String LEG;
    String SHOULDER;
    String SWIMINF;
    String DAY;
    String HOUR;
    String ANTRENOR;
    String LICENCE;
    String RACINGS;

    //public users(){}

    public users(byte[] IMAGE, String NAME, String SURNAME, String TC,String DATE, String SEX, String MOMJOB, String DADJOB, String SCHOOL, String CLASS, String TEL, String MAIL, String ADRESS, String YAKINTEL, String HOMETEL, String JOBADRESS, String BLOODTYPE, String HEALTHPROBLEM, String SURGERY, String DRUG, String LENGTH, String WEIGHT, String ARM, String LEG, String SHOULDER, String DAY, String HOUR, String SWIMINF, String ANTRENOR, String LICENCE, String RACINGS) {
        this.IMAGE = IMAGE;
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.TC = TC;
        this.DATE = DATE;
        this.SEX = SEX;
        this.MOMJOB = MOMJOB;
        this.DADJOB = DADJOB;
        this.SCHOOL = SCHOOL;
        this.CLASS = CLASS;
        this.TEL = TEL;
        this.MAIL = MAIL;
        this.ADRESS = ADRESS;
        this.YAKINTEL = YAKINTEL;
        this.HOMETEL = HOMETEL;
        this.JOBADRESS = JOBADRESS;
        this.BLOODTYPE = BLOODTYPE;
        this.HEALTHPROBLEM = HEALTHPROBLEM;
        this.SURGERY = SURGERY;
        this.DRUG = DRUG;
        this.LENGTH = LENGTH;
        this.WEIGHT = WEIGHT;
        this.ARM = ARM;
        this.LEG = LEG;
        this.SHOULDER = SHOULDER;
        this.SWIMINF = SWIMINF;
        this.DAY = DAY;
        this.HOUR = HOUR;
        this.ANTRENOR = ANTRENOR;
        this.LICENCE = LICENCE;
        this.RACINGS = RACINGS;
    }

    public users(String NAME, String SURNAME, String TC,String DATE, String SEX, String MOMJOB, String DADJOB, String SCHOOL, String CLASS,
                 String TEL, String MAIL, String ADRESS, String YAKINTEL, String HOMETEL, String JOBADRESS,
                 String BLOODTYPE, String HEALTHPROBLEM, String SURGERY, String DRUG, String LENGTH, String WEIGHT,
                 String ARM, String LEG, String SHOULDER, String SWIMINF, String DAY, String HOUR, String ANTRENOR, String LICENCE,
                 String RACINGS) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.TC = TC;
        this.DATE = DATE;
        this.SEX = SEX;
        this.MOMJOB = MOMJOB;
        this.DADJOB = DADJOB;
        this.SCHOOL = SCHOOL;
        this.CLASS = CLASS;
        this.TEL = TEL;
        this.MAIL = MAIL;
        this.ADRESS = ADRESS;
        this.YAKINTEL = YAKINTEL;
        this.HOMETEL = HOMETEL;
        this.JOBADRESS = JOBADRESS;
        this.BLOODTYPE = BLOODTYPE;
        this.HEALTHPROBLEM = HEALTHPROBLEM;
        this.SURGERY = SURGERY;
        this.DRUG = DRUG;
        this.LENGTH = LENGTH;
        this.WEIGHT = WEIGHT;
        this.ARM = ARM;
        this.LEG = LEG;
        this.SHOULDER = SHOULDER;
        this.SWIMINF = SWIMINF;
        this.DAY = DAY;
        this.HOUR = HOUR;
        this.ANTRENOR = ANTRENOR;
        this.LICENCE = LICENCE;
        this.RACINGS = RACINGS;
    }

    public byte[] getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(byte[] IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getMOMJOB() {
        return MOMJOB;
    }

    public void setMOMJOB(String MOMJOB) {
        this.MOMJOB = MOMJOB;
    }

    public String getDADJOB() {
        return DADJOB;
    }

    public void setDADJOB(String DADJOB) {
        this.DADJOB = DADJOB;
    }

    public String getSCHOOL() {
        return SCHOOL;
    }

    public void setSCHOOL(String SCHOOL) {
        this.SCHOOL = SCHOOL;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public String getADRESS() {
        return ADRESS;
    }

    public void setADRESS(String ADRESS) {
        this.ADRESS = ADRESS;
    }

    public String getYAKINTEL() {
        return YAKINTEL;
    }

    public void setYAKINTEL(String YAKINTEL) {
        this.YAKINTEL = YAKINTEL;
    }

    public String getHOMETEL() {
        return HOMETEL;
    }

    public void setHOMETEL(String HOMETEL) {
        this.HOMETEL = HOMETEL;
    }

    public String getJOBADRESS() {
        return JOBADRESS;
    }

    public void setJOBADRESS(String JOBADRESS) {
        this.JOBADRESS = JOBADRESS;
    }

    public String getBLOODTYPE() {
        return BLOODTYPE;
    }

    public void setBLOODTYPE(String BLOODTYPE) {
        this.BLOODTYPE = BLOODTYPE;
    }

    public String getHEALTHPROBLEM() {
        return HEALTHPROBLEM;
    }

    public void setHEALTHPROBLEM(String HEALTHPROBLEM) {
        this.HEALTHPROBLEM = HEALTHPROBLEM;
    }

    public String getSURGERY() {
        return SURGERY;
    }

    public void setSURGERY(String SURGERY) {
        this.SURGERY = SURGERY;
    }

    public String getDRUG() {
        return DRUG;
    }

    public void setDRUG(String DRUG) {
        this.DRUG = DRUG;
    }

    public String getLENGTH() {
        return LENGTH;
    }

    public void setLENGTH(String LENGTH) {
        this.LENGTH = LENGTH;
    }

    public String getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(String WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public String getARM() {
        return ARM;
    }

    public void setARM(String ARM) {
        this.ARM = ARM;
    }

    public String getLEG() {
        return LEG;
    }

    public void setLEG(String LEG) {
        this.LEG = LEG;
    }

    public String getSHOULDER() {
        return SHOULDER;
    }

    public void setSHOULDER(String SHOULDER) {
        this.SHOULDER = SHOULDER;
    }

    public String getSWIMINF() {
        return SWIMINF;
    }

    public void setSWIMINF(String SWIMINF) {
        this.SWIMINF = SWIMINF;
    }

    public String getDAY() {
        return DAY;
    }

    public void setDAY(String DAY) {
        this.DAY = DAY;
    }

    public String getHOUR() {
        return HOUR;
    }

    public void setHOUR(String HOUR) {
        this.HOUR = HOUR;
    }

    public String getANTRENOR() {
        return ANTRENOR;
    }

    public void setANTRENOR(String ANTRENOR) {
        this.ANTRENOR = ANTRENOR;
    }

    public String getLICENCE() {
        return LICENCE;
    }

    public void setLICENCE(String LICENCE) {
        this.LICENCE = LICENCE;
    }

    public String getRACINGS() {
        return RACINGS;
    }

    public void setRACINGS(String RACINGS) {
        this.RACINGS = RACINGS;
    }
    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }






}

package com.poolapp.poolapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

import java.io.File;
import java.sql.Blob;

public class dB extends SQLiteOpenHelper  {
    private static final  int database_VERSION = 1;
    private static final  String database_NAME = "poolApp";
    private static final  String table_USERS = "users";
    private static final  String user_IMAGE = "image";
    private static final  String user_NAME = "name";
    private static final  String user_SURNAME ="surname";
    private static final  String user_TC = "tc";
    private static final  String user_DATE = "date";
    private static final  String user_SEX = "sex";
    private static final  String user_MOMJOB = "momjob";
    private static final  String user_DADJOB = "dadjob";
    private static final  String user_SCHOOL = "school";
    private static final  String user_CLASS = "class";
    private static final  String user_TEL = "tel";
    private static final  String user_MAIL = "mail";
    private static final  String user_ADRESS = "adress";
    private static final  String user_YAKINTEL = "yakintel";
    private static final  String user_HOMETEL = "hometel";
    private static final  String user_JOBADRESS = "jobadress";
    private static final  String user_BLOODTYPE = "bloodtype";
    private static final  String user_HEALTHPROBLEM = "healthproblem";
    private static final  String user_SURGERY = "surgery";
    private static final  String user_DRUG = "drug";
    private static final  String user_LENGTH = "length";
    private static final  String user_WEIGHT = "weight";
    private static final  String user_ARM = "arm";
    private static final  String user_LEG = "leg";
    private static final  String user_SHOULDER = "shoulder";
    private static final  String user_SWIMINF = "swiminf";
    private static final  String user_DAY = "day";
    private static final  String user_HOUR = "hour";
    private static final  String user_ANTRENOR ="antrenor";
    private static final  String user_LICENCE = "licence";
    private static final  String user_RACINGS = "racings";
    private static final  String CREATE_USERS_TABLE = "CREATE TABLE " +
            ""+table_USERS+" (" +
            ""+user_IMAGE+" BLOB," +
            ""+user_NAME+" TEXT NOT NULL," +
            ""+user_SURNAME+" TEXT NOT NULL," +
            ""+user_TC+" TEXT NOT NULL," +
            ""+user_DATE+" TEXT NOT NULL," +
            ""+user_SEX+" TEXT NOT NULL," +
            ""+user_MOMJOB+" TEXT," +
            ""+user_DADJOB+" TEXT," +
            ""+user_SCHOOL+" TEXT," +
            ""+user_CLASS+" TEXT," +
            ""+user_TEL+" TEXT NOT NULL," +
            ""+user_MAIL+" TEXT," +
            ""+user_ADRESS+" TEXT," +
            ""+user_YAKINTEL+" TEXT," +
            ""+user_HOMETEL+" TEXT," +
            ""+user_JOBADRESS+" TEXT," +
            ""+user_BLOODTYPE+" TEXT," +
            ""+user_HEALTHPROBLEM+" TEXT," +
            ""+user_SURGERY+" TEXT," +
            ""+user_DRUG+" TEXT," +
            ""+user_LENGTH+" TEXT," +
            ""+user_WEIGHT+" TEXT," +
            ""+user_ARM+" TEXT," +
            ""+user_LEG+" TEXT," +
            ""+user_SHOULDER+" TEXT," +
            ""+user_SWIMINF+" TEXT," +
            ""+user_DAY+" TEXT NOT NULL," +
            ""+user_HOUR+" TEXT NOT NULL," +
            ""+user_ANTRENOR+" TEXT NOT NULL," +
            ""+user_LICENCE+" TEXT," +
            ""+user_RACINGS+" TEXT);";
    public dB(Context context) {
        super(context, database_NAME, null, database_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USERS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_USERS);
        this.onCreate(db);
    }


    public void addUser(users user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(user_IMAGE, user.getIMAGE());
        values.put(user_NAME, user.getNAME());
        values.put(user_SURNAME, user.getSURNAME());
        values.put(user_TC, user.getTC());
        values.put(user_DATE, user.getDATE());
        values.put(user_SEX, user.getSEX());
        values.put(user_MOMJOB, user.getMOMJOB());
        values.put(user_DADJOB, user.getDADJOB());
        values.put(user_SCHOOL, user.getSCHOOL());
        values.put(user_CLASS, user.getCLASS());
        values.put(user_TEL, user.getTEL());
        values.put(user_MAIL, user.getMAIL());
        values.put(user_ADRESS, user.getADRESS());
        values.put(user_YAKINTEL, user.getYAKINTEL());
        values.put(user_HOMETEL, user.getHOMETEL());
        values.put(user_JOBADRESS, user.getJOBADRESS());
        values.put(user_BLOODTYPE, user.getBLOODTYPE());
        values.put(user_HEALTHPROBLEM, user.getHEALTHPROBLEM());
        values.put(user_SURGERY, user.getSURGERY());
        values.put(user_DRUG, user.getDRUG());
        values.put(user_LENGTH, user.getLENGTH());
        values.put(user_WEIGHT, user.getWEIGHT());
        values.put(user_ARM, user.getARM());
        values.put(user_LEG, user.getLEG());
        values.put(user_SHOULDER, user.getSHOULDER());
        values.put(user_SWIMINF, user.getSWIMINF());
        values.put(user_DAY, user.getDAY());
        values.put(user_HOUR, user.getHOUR());
        values.put(user_ANTRENOR, user.getANTRENOR());
        values.put(user_LICENCE, user.getLICENCE());
        values.put(user_RACINGS, user.getRACINGS());
        db.insert(table_USERS, null, values);
        db.close();

    }

}

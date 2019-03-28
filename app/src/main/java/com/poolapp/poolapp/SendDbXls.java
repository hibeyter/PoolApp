package com.poolapp.poolapp;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.util.Locale;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class SendDbXls extends AppCompatActivity {

    String table_users="users";
    String table_ucret="ucret";
    String table_yoklama="yoklama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_db_xls);
    }

    public Cursor getdb(String table_name) {
        Cursor res = fragment5.database.rawQuery("select * from " + table_name + " ",
                null);
        return res;
    }
    public  void sendmail(View view){
        Cursor cursorusers =getdb(table_users);
        Cursor cursorucret= getdb(table_ucret);
        Cursor cursoryoklama= getdb(table_yoklama);
        File sd = Environment.getExternalStorageDirectory();
        String csvFile = "veriler.xls";

        File directory = new File(sd.getAbsolutePath());
        if (!directory.isDirectory()) {
            directory.mkdirs();
        }

        try {
            File file = new File(directory, csvFile);
            WorkbookSettings wbSettings = new WorkbookSettings();
            wbSettings.setLocale(new Locale("en", "EN"));
            WritableWorkbook workbook;
            workbook = Workbook.createWorkbook(file, wbSettings);
            //region USERS Tablosu
            WritableSheet sheet = workbook.createSheet("Users", 0);

            sheet.addCell(new Label(0, 0, "ADI"));
            sheet.addCell(new Label(1, 0, "SOYADI"));
            sheet.addCell(new Label(2, 0, "TC"));
            sheet.addCell(new Label(3, 0, "DATE"));
            sheet.addCell(new Label(4, 0, "CİNSİYET"));
            sheet.addCell(new Label(5, 0, "ANNE-MESLEK"));
            sheet.addCell(new Label(6, 0, "BABA-MESLEK"));
            sheet.addCell(new Label(7, 0, "OKUL"));
            sheet.addCell(new Label(8, 0, "SINIF"));
            sheet.addCell(new Label(9, 0, "TEL"));
            sheet.addCell(new Label(10, 0, "MAİL"));
            sheet.addCell(new Label(11, 0, "ADRES"));
            sheet.addCell(new Label(12, 0, "YAKIN-TEL"));
            sheet.addCell(new Label(13, 0, "EV-TEL"));
            sheet.addCell(new Label(14, 0, "İŞ-ADRESİ"));
            sheet.addCell(new Label(15, 0, "KAN GRUBU"));
            sheet.addCell(new Label(16, 0, "SAGLIK"));
            sheet.addCell(new Label(17, 0, "AMELİYAT"));
            sheet.addCell(new Label(18, 0, "İLAÇ"));
            sheet.addCell(new Label(19, 0, "BOY"));
            sheet.addCell(new Label(20, 0, "KİLO"));
            sheet.addCell(new Label(21, 0, "KOL UZUNLUĞU"));
            sheet.addCell(new Label(22, 0, "BACAK"));
            sheet.addCell(new Label(23, 0, "OMUZ"));
            sheet.addCell(new Label(24, 0, "GÜN"));
            sheet.addCell(new Label(25, 0, "SAAT"));
            sheet.addCell(new Label(26, 0, "YÜZME"));
            sheet.addCell(new Label(27, 0, "ANTRENÖR"));
            sheet.addCell(new Label(28, 0, "LİSANS NO"));
            sheet.addCell(new Label(29, 0, "YARİŞMALAR"));


            if (cursorusers.moveToFirst()) {
                do {
                    int i = cursorusers.getPosition() + 1;
                    sheet.addCell(new Label(0, i, cursorusers.getString(cursorusers.getColumnIndex("ad"))));
                    sheet.addCell(new Label(1, i,  cursorusers.getString(cursorusers.getColumnIndex("soyad"))));
                    sheet.addCell(new Label(2, i, cursorusers.getString(cursorusers.getColumnIndex("tc"))));
                    sheet.addCell(new Label(3, i,  cursorusers.getString(cursorusers.getColumnIndex("date"))));
                    sheet.addCell(new Label(4, i,  cursorusers.getString(cursorusers.getColumnIndex("cinsiyet"))));
                    sheet.addCell(new Label(5, i,  cursorusers.getString(cursorusers.getColumnIndex("ameslek"))));
                    sheet.addCell(new Label(6, i,  cursorusers.getString(cursorusers.getColumnIndex("bmeslek"))));
                    sheet.addCell(new Label(7, i,  cursorusers.getString(cursorusers.getColumnIndex("okul"))));
                    sheet.addCell(new Label(8, i,  cursorusers.getString(cursorusers.getColumnIndex("sinif"))));
                    sheet.addCell(new Label(9, i,  cursorusers.getString(cursorusers.getColumnIndex("tel"))));
                    sheet.addCell(new Label(10, i,  cursorusers.getString(cursorusers.getColumnIndex("mail"))));
                    sheet.addCell(new Label(11, i,  cursorusers.getString(cursorusers.getColumnIndex("adres"))));
                    sheet.addCell(new Label(12, i,  cursorusers.getString(cursorusers.getColumnIndex("yakintel"))));
                    sheet.addCell(new Label(13, i,  cursorusers.getString(cursorusers.getColumnIndex("evtel"))));
                    sheet.addCell(new Label(14, i,  cursorusers.getString(cursorusers.getColumnIndex("isadresi"))));
                    sheet.addCell(new Label(15, i,  cursorusers.getString(cursorusers.getColumnIndex("kangrb"))));
                    sheet.addCell(new Label(16, i,  cursorusers.getString(cursorusers.getColumnIndex("saglik"))));
                    sheet.addCell(new Label(17, i,  cursorusers.getString(cursorusers.getColumnIndex("ameliyat"))));
                    sheet.addCell(new Label(18, i,  cursorusers.getString(cursorusers.getColumnIndex("ilac"))));
                    sheet.addCell(new Label(19, i,  cursorusers.getString(cursorusers.getColumnIndex("boy"))));
                    sheet.addCell(new Label(20, i,  cursorusers.getString(cursorusers.getColumnIndex("kilo"))));
                    sheet.addCell(new Label(21, i,  cursorusers.getString(cursorusers.getColumnIndex("koluzunlugu"))));
                    sheet.addCell(new Label(22, i,  cursorusers.getString(cursorusers.getColumnIndex("bacak"))));
                    sheet.addCell(new Label(23, i,  cursorusers.getString(cursorusers.getColumnIndex("omuz"))));
                    sheet.addCell(new Label(24, i,  cursorusers.getString(cursorusers.getColumnIndex("gun"))));
                    sheet.addCell(new Label(25, i,  cursorusers.getString(cursorusers.getColumnIndex("saat"))));
                    sheet.addCell(new Label(26, i,  cursorusers.getString(cursorusers.getColumnIndex("yuzme"))));
                    sheet.addCell(new Label(27, i,  cursorusers.getString(cursorusers.getColumnIndex("antrenor"))));
                    sheet.addCell(new Label(28, i,  cursorusers.getString(cursorusers.getColumnIndex("lisansno"))));
                    sheet.addCell(new Label(29, i,  cursorusers.getString(cursorusers.getColumnIndex("yarismalar"))));
                } while (cursorusers.moveToNext());
            }
            cursorusers.close();
           //endregion
            //region Ucret Tablosu
            WritableSheet sheet1 = workbook.createSheet("Ucretler", 1);
            sheet1.addCell(new Label(0, 0, "ADI"));
            sheet1.addCell(new Label(1, 0, "SOYADI"));
            sheet1.addCell(new Label(2, 0, "TC"));
            sheet1.addCell(new Label(3, 0, "TARİH"));
            sheet1.addCell(new Label(4, 0, "ÜCRET-MİKTARI"));
            if (cursorucret.moveToFirst()) {
                do {
                    int i = cursorucret.getPosition() + 1;
                    sheet1.addCell(new Label(0, i, cursorucret.getString(cursorucret.getColumnIndex("ad"))));
                    sheet1.addCell(new Label(1, i,  cursorucret.getString(cursorucret.getColumnIndex("soyad"))));
                    sheet1.addCell(new Label(2, i,  cursorucret.getString(cursorucret.getColumnIndex("tc"))));
                    sheet1.addCell(new Label(3, i,  cursorucret.getString(cursorucret.getColumnIndex("tarih"))));
                    sheet1.addCell(new Label(4, i,  cursorucret.getString(cursorucret.getColumnIndex("miktar"))));
                } while (cursorucret.moveToNext());
            }
            cursorucret.close();
            //endregion
            //region Yoklama Tablosu
            WritableSheet sheet2 = workbook.createSheet("Yoklama", 2);
            sheet2.addCell(new Label(0, 0, "TC"));
            sheet2.addCell(new Label(1, 0, "AD"));
            sheet2.addCell(new Label(2, 0, "SOYAD"));
            sheet2.addCell(new Label(3, 0, "GÜN"));
            sheet2.addCell(new Label(4, 0, "SAAT"));
            sheet2.addCell(new Label(5, 0, "TARİH"));
            sheet2.addCell(new Label(6, 0, "VAR-YOK"));
            if (cursoryoklama.moveToFirst()) {
                do {
                    int i = cursoryoklama.getPosition() + 1;
                    sheet2.addCell(new Label(0, i, cursoryoklama.getString(cursoryoklama.getColumnIndex("tc"))));
                    sheet2.addCell(new Label(1, i,  cursoryoklama.getString(cursoryoklama.getColumnIndex("name"))));
                    sheet2.addCell(new Label(2, i,  cursoryoklama.getString(cursoryoklama.getColumnIndex("surname"))));
                    sheet2.addCell(new Label(3, i,  cursoryoklama.getString(cursoryoklama.getColumnIndex("gun"))));
                    sheet2.addCell(new Label(4, i,  cursoryoklama.getString(cursoryoklama.getColumnIndex("saat"))));
                    sheet2.addCell(new Label(5, i,  cursoryoklama.getString(cursoryoklama.getColumnIndex("tarih"))));
                    sheet2.addCell(new Label(6, i,  cursoryoklama.getString(cursoryoklama.getColumnIndex("varyok"))));
                } while (cursoryoklama.moveToNext());
            }
            cursoryoklama.close();
            //endregion
            workbook.write();
            workbook.close();
            Toast.makeText(getApplication(),
                    "Veriler eklendi excel dosyası oluşturuldu", Toast.LENGTH_SHORT).show();

        } catch(Exception e){
            e.printStackTrace();
        }

        String dosyaadi="veriler.xls";
        File dosyakonumu = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), dosyaadi);
        Uri paket = Uri.fromFile(dosyakonumu);
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent .setType("vnd.android.cursorusers.dir/email");
        String to[] = {"hasta5634@gmail.com"};
        emailIntent .putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent .putExtra(Intent.EXTRA_STREAM, paket);
        emailIntent .putExtra(Intent.EXTRA_SUBJECT, "BİLGİ");
        startActivity(Intent.createChooser(emailIntent , "MAİL GÖNDER"));

    }
}
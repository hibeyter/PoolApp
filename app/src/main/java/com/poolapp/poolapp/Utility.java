package com.poolapp.poolapp;

import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;

public class Utility {

    public static byte[] getBytesDb(Bitmap bitmap)
    {
        try
        {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 20, stream);
            return stream.toByteArray();
        }
        catch (Exception ex)
        {
            ex.toString();
            return new byte[10];
        }
    }
}

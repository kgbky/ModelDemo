package com.smile.modeldemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018/1/30    14:12
 */

public class DiskCache implements ImageCache {

    final static String CACHE_DIR = "sdcard/cache/";

    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(CACHE_DIR + url);
    }

    public void put(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(CACHE_DIR + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CloseUtils.close(fileOutputStream);
        }
    }

}

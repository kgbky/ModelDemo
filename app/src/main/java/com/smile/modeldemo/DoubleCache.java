package com.smile.modeldemo;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2018/1/30    14:27
 */

public class DoubleCache implements ImageCache {

    MemoryCache memoryCache = new MemoryCache();
    DiskCache diskCache = new DiskCache();

    public Bitmap get(String url) {
        Bitmap bitmap = memoryCache.get(url);
        if (bitmap == null) {
            bitmap = diskCache.get(url);
        }
        return bitmap;
    }

    public void put(String url, Bitmap bitmap) {
        memoryCache.put(url, bitmap);
        diskCache.put(url, bitmap);
    }

}

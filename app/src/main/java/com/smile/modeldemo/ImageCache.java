package com.smile.modeldemo;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2018/1/30    14:45
 */

public interface ImageCache {
    Bitmap get(String url);

    void put(String url, Bitmap bitmap);
}

package com.smile.modeldemo;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Administrator on 2018/1/30    11:35
 *
 * @author Administrator
 */

public class MemoryCache implements ImageCache {
    /**
     * 图片缓存
     */
    LruCache<String, Bitmap> mImageCache;

    public MemoryCache() {
        initImageCache();
    }

    private void initImageCache() {
        //可使用的内存大小
        int maxMemory = (int) (Runtime.getRuntime().maxMemory()
                / 1024);
        //缓存大小为可用内存的四分之一
        int cacheSize = maxMemory / 4;
        mImageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);
    }

    public Bitmap get(String url) {
        return mImageCache.get(url);
    }

}
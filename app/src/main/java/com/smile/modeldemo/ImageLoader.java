package com.smile.modeldemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/1/30    10:19
 */

public class ImageLoader {
    /**
     * 图片缓存
     */
    LruCache<String, Bitmap> mImageCache;
    /**
     * 线程池，线程数量为cpu的数量
     */
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    /**
     * UI Handler
     */
    Handler mUIHandler = new Handler(Looper.getMainLooper());

    public ImageLoader() {
        initImageCache();
    }

    private void initImageCache() {
        //可使用的内存大小
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //缓存大小为可用内存的四分之一
        int cacheSize = maxMemory / 4;
        mImageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    public void displayImage(final String url, final ImageView imageView) {
        imageView.setTag(url);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if (bitmap == null) {
                    return;
                }
                if (imageView.getTag().equals(url)) {
                    updateImageView(imageView, bitmap);
                }
                mImageCache.put(url, bitmap);
            }
        });
    }

    private void updateImageView(final ImageView imageView, final Bitmap bitmap) {
        mUIHandler.post(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(bitmap);
            }
        });
    }

    private Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

}

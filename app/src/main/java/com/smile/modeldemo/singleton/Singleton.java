package com.smile.modeldemo.singleton;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/7    14:11
 */

public class Singleton {
    private static final String TAG = "Singleton";
    private static Singleton singleton = new Singleton();

    private Singleton() {
        Log.d(TAG, "Singleton: create instance");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

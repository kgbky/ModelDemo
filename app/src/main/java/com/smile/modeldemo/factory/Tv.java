package com.smile.modeldemo.factory;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/10    10:06
 */

public class Tv extends Product {

    private static final String TAG = "factory";

    private String owner;

    public Tv(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        Log.d(TAG, "使用" + owner + "的电视");
    }
}

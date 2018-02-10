package com.smile.modeldemo.adapter.m1;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/5    10:07
 */

public class Banner {

    private static final String TAG = "Banner";

    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        Log.d(TAG, "()" + str);
    }

    public void showWithAster() {
        Log.d(TAG, "**" + str);
    }
}

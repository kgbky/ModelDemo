package com.smile.modeldemo.templateMethod;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/8    14:49
 */

public class CharDisplay extends AbstractDisplay {
    private char aChar;
    private static final String TAG = "======";

    public CharDisplay(char ch) {
        aChar = ch;
    }

    @Override
    void open() {
        Log.d(TAG, "<<");
    }

    @Override
    void print() {
        Log.d(TAG, aChar + "");
    }

    @Override
    void close() {
        Log.d(TAG, ">>");
    }

}

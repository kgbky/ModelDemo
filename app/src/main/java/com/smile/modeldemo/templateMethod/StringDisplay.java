package com.smile.modeldemo.templateMethod;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/8    14:50
 */

public class StringDisplay extends AbstractDisplay {

    private static final String TAG = "======";
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    void open() {
        printLine();
    }

    private void printLine() {
        Log.d(TAG, "<<<<<<<<<");
    }

    @Override
    void print() {
        Log.d(TAG, "|" + string + "|");
    }

    @Override
    void close() {
        printLine();
    }
}

package com.smile.modeldemo.builder;

import android.util.Log;

public class XBuilder implements Builder {
    @Override
    public void makeTitle(String title) {
        Log.d("abc", "xBuilder makeTitle: ");
    }

    @Override
    public void makeString(String str) {
        Log.d("abc", "xBuilder makeString: ");
    }

    @Override
    public void makeItems(String[] items) {
        for (String str :
                items) {
            Log.d("abc", "xBuilder makeItem: " + str);
        }
    }

    @Override
    public void close() {
        Log.d("abc", "xBuilder close: ");
    }

}
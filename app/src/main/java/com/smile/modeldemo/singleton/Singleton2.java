package com.smile.modeldemo.singleton;

/**
 * Created by Administrator on 2018/2/8    14:45
 */

public class Singleton2 {
    private static final Singleton2 ourInstance = new Singleton2();

    public static Singleton2 getInstance() {
        return ourInstance;
    }

    private Singleton2() {
    }
}

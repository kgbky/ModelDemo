package com.smile.modeldemo.singleton;

/**
 * Created by Administrator on 2018/2/8    14:45
 * <p>
 * 懒汉式
 */

public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 ourInstance;

    /**
     * 懒汉式有时需要考虑线程安全问题
     */
    public static synchronized Singleton2 getInstance() {
        if (ourInstance == null) {
            ourInstance = new Singleton2();
        }
        return ourInstance;
    }

}
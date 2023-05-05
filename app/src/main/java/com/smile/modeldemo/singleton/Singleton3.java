package com.smile.modeldemo.singleton;

/**
 * Created by Administrator on 2018/2/8    14:45
 * <p>
 * 懒汉式(双重检查模式)
 */

public class Singleton3 {

    private Singleton3() {
    }

    //第一层锁，保证变量的可见性(及时同步内存)和有序性(禁止指令重排)
    private static volatile Singleton3 ourInstance;

    public static Singleton3 getInstance() {
        if (ourInstance == null) {
            //synchronized 保证线程安全，锁为 Singleton3.class
            synchronized (Singleton3.class) {
                if (ourInstance == null) ourInstance = new Singleton3();
            }
        }
        return ourInstance;
    }

    /**
     * synchronized关键字在实例方法上，锁为当前实例
     * synchronized关键字在静态方法上，锁为当前Class对象
     * synchronized关键字在代码块上，锁为括号里面的对象
     */
}
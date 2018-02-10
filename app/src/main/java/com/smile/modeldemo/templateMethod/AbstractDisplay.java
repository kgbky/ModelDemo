package com.smile.modeldemo.templateMethod;

/**
 * Created by Administrator on 2018/2/8    14:45
 */

public abstract class AbstractDisplay {
    abstract void open();

    abstract void print();

    abstract void close();

    /**
     * 抽象出流程 具体实现看子类
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

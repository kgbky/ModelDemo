package com.smile.modeldemo.templateMethod;

/**
 * Created by Administrator on 2018/2/8    14:45
 */

public abstract class AbstractDisplay {
    abstract void open();

    abstract void print();

    abstract void close();

    /**
     * 模板方法，抽取公共部分，方便修改公共逻辑。
     * <p>
     * 注意final关键字
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

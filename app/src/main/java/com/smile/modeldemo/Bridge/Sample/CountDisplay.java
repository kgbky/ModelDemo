package com.smile.modeldemo.Bridge.Sample;

/**
 * 类的功能层次结构二级
 * <p>
 * multiDisplay() 实现了新功能
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {       // 循环显示times次
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}

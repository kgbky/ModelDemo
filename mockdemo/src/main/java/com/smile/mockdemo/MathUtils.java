package com.smile.mockdemo;

/**
 * Created by Administrator on 2018/2/24    15:51
 */

public final class MathUtils {
    private MathUtils() {
        throw new RuntimeException("不能实例化");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

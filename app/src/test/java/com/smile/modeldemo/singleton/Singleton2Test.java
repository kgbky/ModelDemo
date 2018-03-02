package com.smile.modeldemo.singleton;

import org.junit.Test;

/**
 * Created by Administrator on 2018/2/12    15:11
 */
public class Singleton2Test {
    @Test
    public void getInstance() throws Exception {
        System.out.println(Singleton2.getInstance().toString());
    }

}
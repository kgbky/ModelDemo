package com.smile.modeldemo.adapter.m2;

/**
 * Created by Administrator on 2018/2/5    10:11
 * 中间件 适配器
 * 通过委托 实现Adapter Model
 */

public class PrintBanner extends com.smile.modeldemo.adapter.m2.Print {

    private com.smile.modeldemo.adapter.m2.Banner banner;

    public PrintBanner(String str) {
        banner = new com.smile.modeldemo.adapter.m2.Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

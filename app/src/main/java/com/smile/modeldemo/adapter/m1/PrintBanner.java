package com.smile.modeldemo.adapter.m1;

/**
 * Created by Administrator on 2018/2/5    10:11
 * 中间件 适配器
 * 通过继承 实现Adapter Model
 */

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

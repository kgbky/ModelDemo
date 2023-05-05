package com.smile.modeldemo.bridge;

public class FileDisplayImpl extends DisplayImpl {
    @Override
    public void rawOpen() {
        System.out.println("打开文件");
    }

    @Override
    public void rawPrint() {
        System.out.println("读取并输出文件");
    }

    @Override
    public void rawClose() {
        System.out.println("关闭文件");
    }
}

package com.smile.modeldemo.builder;

/**
 * 定义构建对象需要的方法
 */
public abstract interface Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

    /**
     *  系统源码中的builder模式
     *  AlertDialog.Builder b=new AlertDialog.Builder(null);
     *  b.setMessage("niho");
     *  b.create().show();
     */
}

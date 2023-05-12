package com.smile.modeldemo.Proxy.Sample;

public interface Printable {
    void setPrinterName(String name);   // 设置名字

    public abstract String getPrinterName();            // 获取名字

    public abstract void print(String string);          // 显示文字（打印输出）
}

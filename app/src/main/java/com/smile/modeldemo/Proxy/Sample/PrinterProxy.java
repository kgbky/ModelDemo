package com.smile.modeldemo.Proxy.Sample;

public class PrinterProxy implements Printable {
    private String name;            // 名字
    private Printable real;           // “本人”
    private Class<? extends Printable> className;       // “本人”的类

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {      // 构造函数
        this.name = name;
    }

    public PrinterProxy(String name, Class<? extends Printable> clz) {      // 构造函数
        this.name = name;
        this.className = clz;
    }

    public synchronized void setPrinterName(String name) {  // 设置名字
        if (real != null) {
            real.setPrinterName(name);  // 同时设置“本人”的名字
        }
        this.name = name;
    }

    public String getPrinterName() {    // 获取名字
        return name;
    }

    public void print(String string) {  // 显示
        realize();
        //委托给real对象去完成
        real.print(string);
        }

    private synchronized void realize() {   // 生成“本人”
        if (real == null) {
            try {
                real = className.newInstance();
                real.setPrinterName(name);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    public void setReal(Printable real) {
        this.real = real;
    }
}

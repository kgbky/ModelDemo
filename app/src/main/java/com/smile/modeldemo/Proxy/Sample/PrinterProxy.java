package com.smile.modeldemo.Proxy.Sample;

public class PrinterProxy implements Printable {
    private String name;            // 名字
    private Printable real;           // “本人”
    private String className;       // “本人”的类名

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {      // 构造函数
        this.name = name;
    }

    public PrinterProxy(String name, String clz) {      // 构造函数
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
        real.print(string);
    }

    private synchronized void realize() {   // 生成“本人”
        if (real == null) {
            try {
                real = (Printer) Class.forName(className).newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}

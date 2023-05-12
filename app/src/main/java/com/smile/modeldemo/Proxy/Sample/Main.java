package com.smile.modeldemo.Proxy.Sample;

public class Main {
    public static void main(String[] args) {
        PrinterProxy f = new PrinterProxy("0Name", PrinterProxy.class);
        Printable p = new PrinterProxy("Alice", Printer.class);
        f.setReal(p);
        System.out.println("现在的名字是" + f.getPrinterName() + "。");
        f.setPrinterName("Bob");
        System.out.println("现在的名字是" + f.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}

package com.smile.modeldemo.prototype;

import com.smile.modeldemo.prototype.framework.Product;

public class MessageBox implements Product {

    private static final String TAG = "MessageBox";
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        System.out.println();
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

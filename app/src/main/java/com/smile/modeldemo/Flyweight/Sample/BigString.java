package com.smile.modeldemo.Flyweight.Sample;

public class BigString {
    // “大型字符”的数组
    private BigChar[] bigchars;

    // 构造函数
    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 构造函数
    public BigString(String string, boolean shared) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = shared ? factory.getBigChar(string.charAt(i)) : new BigChar(string.charAt(i));
        }
    }

    // 显示
    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}

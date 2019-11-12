package com.smile.modeldemo.Decorator.Sample;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay mu = new MultiStringDisplay();
        mu.add("MultiStringDisplay");
        mu.add("Hello world");
        mu.add("I am from china");

        Display b1 = new StringDisplay("Hello, world.");
        b1 = mu;

        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();//Hello, world.
        b2.show();// #Hello, world.#
        b3.show();// +-------+  #Hello, world.#
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("你好，世界。")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );
        b4.show();

        Display b5 = new UpDownBorder(b1, '*');
        b5.show();
    }
}

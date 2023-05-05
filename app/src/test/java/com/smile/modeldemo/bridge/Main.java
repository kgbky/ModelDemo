package com.smile.modeldemo.bridge;

import junit.framework.TestCase;

import org.junit.Test;

public class Main extends TestCase {
    @Test
    public void test() {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomDisplay d5 = new RandomDisplay(new FileDisplayImpl());
//        d1.display();
//        d2.display();
//        d3.display();
//        d3.multiDisplay(5);
        d5.randomDisplay(6);
    }
}

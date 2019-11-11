package com.smile.modeldemo.Bridge.A2;

public class Main {
    public static void main(String[] args) {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("\\Bridge\\A2\\star.txt"));
        d.multiDisplay(3);
    }
}

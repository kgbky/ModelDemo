package com.smile.modeldemo.Observer.Sample;

public class SmailObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("SmailObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("ω");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}

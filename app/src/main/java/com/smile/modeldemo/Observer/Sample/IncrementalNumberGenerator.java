package com.smile.modeldemo.Observer.Sample;

public class IncrementalNumberGenerator extends NumberGenerator {

    private int start, end, step;
    private int number;

    IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i += step) {
            number = i;
            notifyObservers();
        }
    }
}

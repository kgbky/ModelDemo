package com.smile.modeldemo.Strategy.Sample;

public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}

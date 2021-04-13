package com.smile.modeldemo.Strategy.Sample;

/**
 * 这两个方法组成了猜拳游戏的算法
 */
public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}

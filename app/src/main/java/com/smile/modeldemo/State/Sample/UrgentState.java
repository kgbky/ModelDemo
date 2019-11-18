package com.smile.modeldemo.State.Sample;

public class UrgentState implements State {

    private static UrgentState singleton = new UrgentState();

    private UrgentState() {                             // 构造函数的可见性是private
    }

    public static UrgentState getInstance() {                 // 获取唯一实例
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {

    }

    @Override
    public void doAlarm(Context context) {

    }

    @Override
    public void doPhone(Context context) {

    }
}

package com.smile.modeldemo.State.Sample;

public class NoonState implements State {

    private NoonState() {
    }

    private static NoonState singleton = new NoonState();

    public static State getInstance() {                 // 获取唯一实例
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (hour != 12) {
            context.changeState(DayState.getInstance());
        }
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

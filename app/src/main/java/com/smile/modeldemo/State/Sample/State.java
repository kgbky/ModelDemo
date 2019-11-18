package com.smile.modeldemo.State.Sample;

/**
 * state接口是依赖于状态的方法的集合
 */
public interface State {
    public abstract void doClock(Context context, int hour);    // 设置时间

    public abstract void doUse(Context context);                // 使用金库

    public abstract void doAlarm(Context context);              // 按下警铃

    public abstract void doPhone(Context context);              // 正常通话
}

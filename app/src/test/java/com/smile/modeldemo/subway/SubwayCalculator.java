package com.smile.modeldemo.subway;

/**
 * Created by Administrator on 2018/2/23    9:58
 */

public final class SubwayCalculator {
    public static int subwayPrice(int miles) {
        if (miles <= 0) return 0;
        if (miles <= 6)
            return 3;
        else if (miles > 6 && miles <= 12)
            return 4;
        else if (miles > 12 && miles <= 22)
            return 5;
        else if (miles > 22 && miles <= 32)
            return 6;
        return 7;
    }
}

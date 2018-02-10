package com.smile.modeldemo.singleton.exercise;

/**
 * Created by Administrator on 2018/2/7    14:40
 */

public class Triple {

    private Triple() {
    }

    private static Triple first;
    private static Triple second;
    private static Triple third;

    public static Triple getInstance(int id) {
        switch (id) {
            case 0:
                return getFirst();
            case 1:
                return getSecond();
            case 2:
                return getThird();
            default:
                return null;
        }
    }

    private synchronized static Triple getFirst() {
        if (first == null)
            first = new Triple();
        return first;
    }

    private synchronized static Triple getSecond() {
        if (second == null)
            second = new Triple();
        return second;
    }

    private synchronized static Triple getThird() {
        if (third == null)
            third = new Triple();
        return third;
    }
}

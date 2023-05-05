package com.smile.modeldemo.bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
//        Random rd = new Random(times);
        int random = times/2;
        multiDisplay(random);
    }

}

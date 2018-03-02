package com.smile.modeldemo.note;

/**
 * Created by Administrator on 2018/2/23    11:11
 */

public class MockLoginImpl implements Login {

    @Override
    public User login(String name, String pwd) {
        return new User("1", name);
    }

}

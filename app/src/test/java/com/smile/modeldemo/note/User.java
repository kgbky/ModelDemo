package com.smile.modeldemo.note;

/**
 * Created by Administrator on 2018/2/23    10:24
 */

public class User {
    public String id;
    public String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}

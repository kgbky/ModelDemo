package com.smile.modeldemo.prototype;

public class Owner implements Cloneable{
    public String name;
    public int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

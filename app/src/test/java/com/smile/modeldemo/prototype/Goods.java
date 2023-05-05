package com.smile.modeldemo.prototype;

public class Goods implements Cloneable {

    public int price;
    public Owner owner;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Goods gs = (Goods) super.clone();
        gs.owner = (Owner) gs.owner.clone();
        return gs;
    }

}

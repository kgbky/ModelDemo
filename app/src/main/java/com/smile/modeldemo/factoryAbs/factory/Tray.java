package com.smile.modeldemo.factoryAbs.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {

    protected ArrayList<Item> list = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        list.add(item);
    }
}

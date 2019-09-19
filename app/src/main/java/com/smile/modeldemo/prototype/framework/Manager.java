package com.smile.modeldemo.prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> map = new HashMap<>();

    public void register(String name, Product product) {
        map.put(name, product);
    }

    public Product create(String name) {
        Product product = map.get(name);
        return product.createClone();
    }

}

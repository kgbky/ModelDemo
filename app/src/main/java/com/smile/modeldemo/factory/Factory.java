package com.smile.modeldemo.factory;

/**
 * Created by Administrator on 2018/2/8    19:38
 */

public abstract class Factory {
    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}

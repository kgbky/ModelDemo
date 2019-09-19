package com.smile.modeldemo.factory;

/**
 * Created by Administrator on 2018/2/8    19:38
 * Factory模式 一般配合单例模式
 */

public abstract class Factory {

    //工厂方法
    public abstract Product createProduct(String owner);

    //工厂方法
    public abstract void registerProduct(Product product);

    //模板方法，模板设计模式
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

}
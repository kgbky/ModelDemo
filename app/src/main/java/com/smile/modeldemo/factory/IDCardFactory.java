package com.smile.modeldemo.factory;

/**
 * Created by Administrator on 2018/2/8    19:45
 */

public class IDCardFactory extends Factory {

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {

    }

}

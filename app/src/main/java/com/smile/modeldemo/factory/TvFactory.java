package com.smile.modeldemo.factory;

/**
 * Created by Administrator on 2018/2/10    10:08
 */

public class TvFactory extends Factory {
    @Override
    public Product createProduct(String owner) {
        return new Tv(owner);
    }

    @Override
    public void registerProduct(Product product) {

    }
}

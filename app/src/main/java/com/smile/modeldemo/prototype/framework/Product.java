package com.smile.modeldemo.prototype.framework;

public interface Product extends Cloneable{

    void use(String s);

    Product createClone();

}

package com.smile.modeldemo.prototype.framework;

/**
 * 实现这个接口，类就获得了clone能力
 */
public interface Product extends Cloneable {

    void use(String s);

    /**
     * 不使用new关键字，而是通过现有对象再clone一个新对象
     */
    Product createClone();

}

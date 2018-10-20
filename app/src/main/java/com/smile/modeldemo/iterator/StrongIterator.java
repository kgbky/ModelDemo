package com.smile.modeldemo.iterator;

/**
 * Created by lenovo on 2018/10/20    21:07
 * <p>
 * 支持反向遍历的Iterator
 */
public interface StrongIterator extends Iterator {

    /**
     * 前面是否还有元素
     */
    boolean hasPrevious();

    /**
     * 向前取出一个元素
     */
    Object previous();
}

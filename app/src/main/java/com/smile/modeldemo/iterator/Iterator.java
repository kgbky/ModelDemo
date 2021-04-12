package com.smile.modeldemo.iterator;

/**
 * Created by Administrator on 2018/2/2    10:42
 * 迭代器
 */

public interface Iterator {
    /**
     * @return true 表示存在下一个元素
     */
    boolean hasNext();

    /**
     * @return 获取下一个元素
     */
    Object next();
}
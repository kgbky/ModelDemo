package com.smile.modeldemo.iterator;

/**
 * Created by Administrator on 2018/2/2    10:46
 * <p>
 * 需要遍历的元素 的集合
 */

public interface Aggregate {

    /**
     * 集合都可以被迭代
     *
     * @return 返回迭代器
     */
    Iterator iterator();
}
package com.xrca.iterator;

/**
 * @author xrca
 * @description 迭代器接口
 * @date 2020-07-04 20:54
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    void remove();
}

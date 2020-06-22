package com.xrca.strategy;

/**
 * @author xrca
 * @description 比较器接口
 * @date 2020-06-21 22:32
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}

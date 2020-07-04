package com.xrca.iterator;

/**
 * @author xrca
 * @description 学院抽象类
 * @date 2020-07-04 22:26
 */
public interface College {

    Iterator iterator();

    boolean addDepartment(String name);
}

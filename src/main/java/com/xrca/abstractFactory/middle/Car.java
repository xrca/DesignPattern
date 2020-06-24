package com.xrca.abstractFactory.middle;

import com.xrca.abstractFactory.Vehicle;

/**
 * @author xrca
 * @description 汽车交通工具
 * @date 2020-06-25 1:09
 */
public class Car extends Vehicle {
    @Override
    public void go() {
        System.out.println("欢迎乘坐D2路公交车...");
    }
}

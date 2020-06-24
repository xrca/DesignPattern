package com.xrca.abstractFactory.big;

import com.xrca.abstractFactory.Vehicle;

/**
 * @author xrca
 * @description 飞机交通工具
 * @date 2020-06-25 1:09
 */
public class Plane extends Vehicle {
    @Override
    public void go() {
        System.out.println("欢迎乘坐东方航空...");
    }
}

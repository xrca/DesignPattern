package com.xrca.abstractFactory.mini;

import com.xrca.abstractFactory.Vehicle;

/**
 * @author xrca
 * @description 自行车交通工具
 * @date 2020-06-25 1:09
 */
public class Bicycle extends Vehicle {

    @Override
    public void go() {
        System.out.println("欢迎使用hello单车...");
    }
}

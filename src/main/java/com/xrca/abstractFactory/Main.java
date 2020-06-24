package com.xrca.abstractFactory;

import com.xrca.abstractFactory.big.BigFactory;
import com.xrca.abstractFactory.middle.MiddleFactory;
import com.xrca.abstractFactory.mini.MiniFactory;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-25 0:48
 */
public class Main {
    public static void main(String[] args) {
        // 小型
        AbstractFactory miniFactory = new MiniFactory();
        miniFactory.createVehicle().go();
        miniFactory.createPhone().surfing();
        miniFactory.createGame().play();

        // 中型
        AbstractFactory middleFactory = new MiddleFactory();
        middleFactory.createVehicle().go();
        middleFactory.createPhone().surfing();
        middleFactory.createGame().play();

        // 大型
        AbstractFactory bigFactory = new BigFactory();
        bigFactory.createVehicle().go();
        bigFactory.createPhone().surfing();
        bigFactory.createGame().play();
    }
}

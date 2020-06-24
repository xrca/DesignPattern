package com.xrca.abstractFactory;

/**
 * @author xrca
 * @description 抽象工厂类
 * @date 2020-06-25 0:57
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();

    public abstract Phone createPhone();

    public abstract Game createGame();
}

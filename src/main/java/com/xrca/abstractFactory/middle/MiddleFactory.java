package com.xrca.abstractFactory.middle;

import com.xrca.abstractFactory.AbstractFactory;
import com.xrca.abstractFactory.Game;
import com.xrca.abstractFactory.Phone;
import com.xrca.abstractFactory.Vehicle;

/**
 * @author xrca
 * @description 中型生产工厂
 * @date 2020-06-25 1:11
 */
public class MiddleFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }

    @Override
    public Game createGame() {
        return new WOW();
    }
}

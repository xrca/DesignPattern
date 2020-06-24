package com.xrca.abstractFactory.big;

import com.xrca.abstractFactory.AbstractFactory;
import com.xrca.abstractFactory.Game;
import com.xrca.abstractFactory.Phone;
import com.xrca.abstractFactory.Vehicle;

/**
 * @author xrca
 * @description 大型生产工厂
 * @date 2020-06-25 1:11
 */
public class BigFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }

    @Override
    public Phone createPhone() {
        return new Apple();
    }

    @Override
    public Game createGame() {
        return new Zelda();
    }
}

package com.xrca.abstractFactory.mini;

import com.xrca.abstractFactory.AbstractFactory;
import com.xrca.abstractFactory.Game;
import com.xrca.abstractFactory.Phone;
import com.xrca.abstractFactory.Vehicle;

/**
 * @author xrca
 * @description 小型生产工厂
 * @date 2020-06-25 1:00
 */
public class MiniFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }

    public Phone createPhone() {
        return new MeiZu();
    }

    public Game createGame() {
        return new DNF();
    }
}

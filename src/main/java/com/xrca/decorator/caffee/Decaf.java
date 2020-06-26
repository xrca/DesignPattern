package com.xrca.decorator.caffee;

import com.xrca.decorator.Drink;

/**
 * @author xrca
 * @description 无因咖啡
 * @date 2020-06-26 16:15
 */
public class Decaf extends Drink {
    public Decaf() {
        setDescription("无因咖啡");
        setPrice(2.0);
    }

    @Override
    public double cost() {
        return this.getPrice();
    }
}

package com.xrca.decorator.caffee;

import com.xrca.decorator.Drink;

/**
 * @author xrca
 * @description 咖啡
 * @date 2020-06-26 16:10
 */
public class Coffee extends Drink {

    @Override
    public double cost() {
        return super.getPrice();
    }
}

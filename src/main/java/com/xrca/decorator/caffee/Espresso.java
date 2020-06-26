package com.xrca.decorator.caffee;

/**
 * @author xrca
 * @description 意大利浓咖啡
 * @date 2020-06-26 16:10
 */
public class Espresso extends Coffee {

    public Espresso() {
        setDescription("意大利咖啡");
        setPrice(2.0);
    }

    @Override
    public double cost() {
        return this.getPrice();
    }
}

package com.xrca.decorator.caffee;

/**
 * @author xrca
 * @description 小杯黑咖啡
 * @date 2020-06-26 16:13
 */
public class ShortBlack extends Coffee {
    public ShortBlack() {
        setDescription("小杯黑咖啡");
        setPrice(1.5);
    }

    @Override
    public double cost() {
        return this.getPrice();
    }
}

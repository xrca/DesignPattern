package com.xrca.decorator.caffee;

/**
 * @author xrca
 * @description 美式咖啡
 * @date 2020-06-26 16:16
 */
public class LongBlack extends Coffee {
    public LongBlack() {
        setDescription("美式咖啡");
        setPrice(3.0);
    }

    @Override
    public double cost() {
        return this.getPrice();
    }
}

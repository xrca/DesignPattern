package com.xrca.decorator;

/**
 * @author xrca
 * @description 牛奶
 * @date 2020-06-26 16:03
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(1);
    }
}

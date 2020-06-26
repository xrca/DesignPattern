package com.xrca.decorator;

/**
 * @author xrca
 * @description 豆浆
 * @date 2020-06-26 16:03
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(1.5);
    }
}

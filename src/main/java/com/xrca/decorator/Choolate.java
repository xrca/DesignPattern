package com.xrca.decorator;

/**
 * @author xrca
 * @description 巧克力
 * @date 2020-06-26 16:03
 */
public class Choolate extends Decorator {
    public Choolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(0.5);
    }
}

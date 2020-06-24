package com.xrca.factoryMethod;

/**
 * @author xrca
 * @description 牛奶生产工厂
 * @date 2020-06-25 0:35
 */
public class MilkFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Milk();
    }
}

package com.xrca.factoryMethod;

/**
 * @author xrca
 * @description 苹果生产工厂
 * @date 2020-06-25 0:33
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Apple();
    }
}

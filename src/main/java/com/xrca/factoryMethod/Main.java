package com.xrca.factoryMethod;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-25 0：33
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFactory();
        Food apple = appleFactory.createFood();
        apple.show();

        AbstractFactory milkFactory = new MilkFactory();
        Food milk = milkFactory.createFood();
        milk.show();
    }
}

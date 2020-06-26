package com.xrca.decorator;

import com.xrca.decorator.caffee.LongBlack;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-26 21:50
 */
public class Main {
    public static void main(String[] args) {
        // 点一份longBlack，加一份豆浆和一份牛奶
        Drink drink = new LongBlack();
        Soy soy = new Soy(drink);
        Milk milk = new Milk(soy);
        System.out.println(milk.cost());
    }
}

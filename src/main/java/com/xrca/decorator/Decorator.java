package com.xrca.decorator;

/**
 * @author xrca
 * @description 装饰者抽象类
 * @date 2020-06-26 15:58
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return drink.cost() + this.getPrice();
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + super.getPrice() + " && " + drink.getDescription() + " " + drink.getPrice();
    }
}

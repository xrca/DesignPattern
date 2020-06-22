package com.xrca.strategy;

/**
 * @author xrca
 * @description 狗类
 * @date 2020-06-21 22:34
 */
public class Dog {
    private double food;

    public Dog(double food) {
        this.food = food;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}

package com.xrca.decorator;

/**
 * @author xrca
 * @description 饮品抽象类
 * @date 2020-06-26 15:54
 */
public abstract class Drink {
    private String description;

    private double price = 0.0;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double cost();
}

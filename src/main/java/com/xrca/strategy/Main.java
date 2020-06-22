package com.xrca.strategy;

import java.util.Arrays;

/**
 * @author xrca
 * @description 策略模式
 * @date 2020-06-21 22:40
 */
public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(3.1), new Dog(2.4), new Dog(4.3), new Dog(1.2)};
        Sorter<Dog> sorter = new Sorter<>();
        //sorter.sort(dogs, new DogComparator());
        // lambda表达式写法
        sorter.sort(dogs, (o1, o2) -> {
            if (o1.getFood() < o2.getFood()) {
                return -1;
            } else if (o1.getFood() > o2.getFood()) {
                return 1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(dogs));
    }
}

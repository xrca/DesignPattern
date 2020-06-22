package com.xrca.strategy;

/**
 * @author xrca
 * @description 狗的比较器
 * @date 2020-06-21 22:34
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getFood() < o2.getFood()) {
            return -1;
        } else if (o1.getFood() > o2.getFood()) {
            return 1;
        }
        return 0;
    }
}

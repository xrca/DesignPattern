package com.xrca.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xrca
 * @description 主题接口
 * @date 2020-06-28 23:29
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObservers();
}

package com.xrca.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xrca
 * @description 抽象组件
 * @date 2020-06-29 21:58
 */
public abstract class Component {
    private String name;

    private List<Component> children = new ArrayList<>();

    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void operation();
}

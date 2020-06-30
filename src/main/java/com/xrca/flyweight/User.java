package com.xrca.flyweight;

/**
 * @author xrca
 * @description 用户
 * @date 2020-06-30 22:36
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

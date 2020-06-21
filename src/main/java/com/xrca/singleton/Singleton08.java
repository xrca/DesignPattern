package com.xrca.singleton;

/**
 * @author xrca
 * @description 枚举单例：不仅可以解决线程同步问题，还可以防止反序列化
 * @date 2020-6-21 22:24
 */
public enum Singleton08 {
    INSTANCE;

    public void say() {
        System.out.println("hello...");
    }
}

package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式
 * @date 2020-6-21 22:24
 */
public class Singleton02 {
    private static Singleton02 INSTANCE;

    static {
         INSTANCE = new Singleton02();
    }

    private Singleton02() {}

    public static Singleton02 getInstance() {
        return INSTANCE;
    }
}

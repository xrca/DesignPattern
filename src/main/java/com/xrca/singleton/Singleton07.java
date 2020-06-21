package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式：懒汉式（lazy loading），静态内部类方式，
 * JVM保证单线程，加载外部类时，不会加载内部类
 * @date 2020-6-21 22:24
 */
public class Singleton07 {
    private Singleton07() {}

    private static class Singleton07Holder {
        private final static  Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return Singleton07Holder.INSTANCE;
    }

    public void say() {
        System.out.println("hello...");
    }
}

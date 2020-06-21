package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式：懒汉式（lazy loading），DCL（Double Check Lock）
 * @date 2020-6-21 22:24
 */
public class Singleton06 {
    private static Singleton06 INSTANCE;

    private Singleton06() {}

    public static Singleton06 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton06();
                }
            }
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("hello...");
    }
}

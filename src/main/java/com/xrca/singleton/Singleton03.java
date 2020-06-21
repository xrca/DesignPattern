package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式：懒汉式（lazy loading）,线程不安全的
 * @date 2020-6-21 22:24
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03() {}

    public static Singleton03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("hello...");
    }
}

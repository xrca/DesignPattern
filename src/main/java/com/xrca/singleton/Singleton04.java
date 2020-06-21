package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式：懒汉式（lazy loading）,加锁后线程安全的，但效率降低
 * @date 2020-6-21 22:24
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;

    private Singleton04() {}

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("hello...");
    }
}

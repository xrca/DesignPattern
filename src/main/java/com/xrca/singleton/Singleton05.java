package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式：懒汉式（lazy loading）
 * @date 2020-6-21 22:24
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;

    private Singleton05() {}

    public static Singleton05 getInstance() {
        if (INSTANCE == null) {
            // 此处可能存在多个线程同时到此位置
            // 试图通过减小代码块的方式提高效率，但是未锁住
            synchronized (Singleton05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

    public void say() {
        System.out.println("hello...");
    }
}

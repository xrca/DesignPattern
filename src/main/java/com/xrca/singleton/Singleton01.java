package com.xrca.singleton;

/**
 * @author xrca
 * @description 单例模式：饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * @date 2020-6-21 22:24
 */
public class Singleton01 {
    private static Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}

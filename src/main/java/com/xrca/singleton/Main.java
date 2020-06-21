package com.xrca.singleton;

/**
 * @author xrca
 * @date 2020-06-21 22:31
 */
public class Main {
    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);

        // ===================================================

        for (int i = 1; i <= 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton08.INSTANCE.hashCode());
            }).start();
        }
    }
}

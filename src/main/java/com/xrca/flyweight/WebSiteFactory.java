package com.xrca.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xrca
 * @description 享元工厂
 * @date 2020-06-30 22:25
 */
public class WebSiteFactory {
    private static final Map<String, WebSite> pool = new HashMap<>();

    public static WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public static int getWebSiteCount() {
        return pool.size();
    }
}

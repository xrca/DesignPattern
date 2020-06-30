package com.xrca.flyweight;

/**
 * @author xrca
 * @description 网站抽象类
 * @date 2020-06-30 22:26
 */
public abstract class WebSite {
    private String type;

    public WebSite(String type) {
        this.type = type;
    }

    public abstract void use(User user);

    public String getType() {
        return type;
    }
}

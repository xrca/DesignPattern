package com.xrca.flyweight;

/**
 * @author xrca
 * @description 具体网站类
 * @date 2020-06-30 22:25
 */
public class ConcreteWebSite extends WebSite {

    public ConcreteWebSite(String type) {
        super(type);
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName() + "正在浏览" + this.getType() + "网站...");
    }
}

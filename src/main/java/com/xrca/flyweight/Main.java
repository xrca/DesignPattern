package com.xrca.flyweight;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-30 22:26
 */
public class Main {
    public static void main(String[] args) {
        WebSite wangYi = WebSiteFactory.getWebSite("博客");
        WebSite tengXun = WebSiteFactory.getWebSite("新闻");
        WebSite sina = WebSiteFactory.getWebSite("新闻");
        WebSite steam = WebSiteFactory.getWebSite("游戏");
        WebSite nga = WebSiteFactory.getWebSite("游戏");

        User xiaoMing = new User("小明");
        User xiaoHong = new User("小红");

        wangYi.use(xiaoMing);
        tengXun.use(xiaoHong);
        sina.use(xiaoHong);
        steam.use(xiaoMing);
        nga.use(xiaoMing);

        System.out.println("网站总数量：" + WebSiteFactory.getWebSiteCount());
    }
}

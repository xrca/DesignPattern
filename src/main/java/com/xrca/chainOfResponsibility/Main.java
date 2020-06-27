package com.xrca.chainOfResponsibility;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-27 20:26
 */
public class Main {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        Request request = new Request();
        request.setContext("待处理请求");

        handler1.handleRequest(request);

        System.out.println(request.getContext());
    }
}

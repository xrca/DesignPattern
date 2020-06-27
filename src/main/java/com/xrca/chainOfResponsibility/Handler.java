package com.xrca.chainOfResponsibility;

/**
 * @author xrca
 * @description 抽象处理者
 * @date 2020-06-27 20:24
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(Request request);
}

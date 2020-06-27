package com.xrca.chainOfResponsibility;

/**
 * @author xrca
 * @description 处理者1
 * @date 2020-06-27 20:29
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(Request request) {
        request.setContext(request.getContext() + "；" + this.getClass().getName() + "处理了");
        if (this.getNext() != null) {
            this.getNext().handleRequest(request);
        }
    }
}

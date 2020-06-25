package com.xrca.mediator;

/**
 * @author xrca
 * @description 同事抽象类
 * @date 2020-06-25 15:49
 */
public abstract class Colleague {
    protected Mediator mediator;

    protected String name;

    // 发送
    public abstract void receive(String name);

    // 接受
    public abstract void send();

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

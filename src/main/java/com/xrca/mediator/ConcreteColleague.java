package com.xrca.mediator;

/**
 * @author xrca
 * @description 具体同事实现类
 * @date 2020-06-25 15:59
 */
public class ConcreteColleague extends Colleague {
    public ConcreteColleague() {}

    public ConcreteColleague(String name) {
        this.name = name;
    }

    @Override
    public void receive(String name) {
        System.out.println("收到同事" + name + "的消息了...");
    }

    @Override
    public void send() {
        System.out.println("发送消息...");
        mediator.relay(this);
    }
}

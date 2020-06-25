package com.xrca.mediator;

/**
 * @author xrca
 * @description 中介者抽象类
 * @date 2020-06-25 15:48
 */
public abstract class Mediator {
    // 注册
    public abstract void register(Colleague colleague);

    // 中转
    public abstract void relay(Colleague colleague);
}

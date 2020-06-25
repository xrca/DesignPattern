package com.xrca.mediator;

/**
 * @author xrca
 * @description 主程序（中介者）
 * @date 2020-06-25 16:02
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague$A = new ConcreteColleague("小明");
        Colleague colleague$B = new ConcreteColleague("小红");

        mediator.register(colleague$A);
        mediator.register(colleague$B);

        colleague$A.send();
    }
}

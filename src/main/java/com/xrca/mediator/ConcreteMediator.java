package com.xrca.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xrca
 * @description 同事中介者
 * @date 2020-06-25 15:52
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (!c.equals(colleague)) {
                c.receive(colleague.getName());
            }
        }
    }
}

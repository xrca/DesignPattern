package com.xrca.composite;

/**
 * @author xrca
 * @description 大学
 * @date 2020-06-29 22:04
 */
public class University extends Component {

    public University(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(getName());
        for (Component component : this.getChildren()) {
            component.operation();
        }
    }
}

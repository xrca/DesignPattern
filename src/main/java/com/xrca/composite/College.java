package com.xrca.composite;

/**
 * @author xrca
 * @description 学院
 * @date 2020-06-29 22:04
 */
public class College extends Component {

    public College(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("\t" + getName());
        for (Component component : this.getChildren()) {
            component.operation();
        }
    }
}

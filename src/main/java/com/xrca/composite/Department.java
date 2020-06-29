package com.xrca.composite;

/**
 * @author xrca
 * @description 部门
 * @date 2020-06-29 22:08
 */
public class Department extends Component {

    public Department(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("\t\t" + getName());
    }
}

package com.xrca.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xrca
 * @description 计算机学院
 * @date 2020-07-04 22:27
 */
public class ComputerCollege implements College {
    private String name;

    private List<Department> departments = new ArrayList<>();

    public ComputerCollege(String name) {
        this.name = name;
    }

    @Override
    public Iterator iterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public boolean addDepartment(String name) {
        return departments.add(new Department(name));
    }
}

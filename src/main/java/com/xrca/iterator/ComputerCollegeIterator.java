package com.xrca.iterator;

import java.util.List;

/**
 * @author xrca
 * @description 计算机学院迭代器
 * @date 2020-07-04 22:29
 */
public class ComputerCollegeIterator implements Iterator<Department> {
    private List<Department> departments;

    private int index = 0;

    public ComputerCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (departments == null || index >= departments.size() || departments.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        return departments.get(index++);
    }

    @Override
    public void remove() {
        departments.remove(index);
    }
}

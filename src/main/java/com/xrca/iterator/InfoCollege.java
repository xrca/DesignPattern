package com.xrca.iterator;

/**
 * @author xrca
 * @description 信息学院
 * @date 2020-07-04 22:27
 */
public class InfoCollege implements College {
    private String name;

    private Department[] departments = new Department[12];

    private int numOfDepartment = 0;

    public InfoCollege(String name) {
        this.name = name;
    }

    @Override
    public Iterator iterator() {
        return new InfoCollegeIterator(departments);
    }

    @Override
    public boolean addDepartment(String name) {
        // 此处简单实现
        if (numOfDepartment < departments.length) {
            departments[numOfDepartment++] = new Department(name);
            return true;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

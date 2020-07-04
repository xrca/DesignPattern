package com.xrca.iterator;

/**
 * @author xrca
 * @description 信息学院迭代器
 * @date 2020-07-04 22:29
 */
public class InfoCollegeIterator implements Iterator {
    private Department[] departments;

    private int position = 0;

    public InfoCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (departments == null || position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[position++];
    }

    @Override
    public void remove() {
        // TODO 此处涉及数据结构知识，需要实现类似list集合的删除功能
    }
}

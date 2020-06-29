package com.xrca.composite;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-29 21:55
 */
public class Main {
    public static void main(String[] args) {
        University university = new University("XX大学");

        College college1 = new College("计算机学院");
        College college2 = new College("数学学院");

        Department department1 = new Department("院办A");
        Department department2 = new Department("团委B");
        Department department3 = new Department("院办C");
        Department department4 = new Department("团委D");

        university.add(college1);
        university.add(college2);

        college1.add(department1);
        college1.add(department2);

        college2.add(department3);
        college2.add(department4);

        university.operation();
    }
}

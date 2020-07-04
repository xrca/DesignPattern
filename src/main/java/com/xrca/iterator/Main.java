package com.xrca.iterator;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-07-04 22:50
 */
public class Main {
    public static void main(String[] args) {
        College computerCollege = new ComputerCollege("计算机学院");
        computerCollege.addDepartment("计算机科学");
        computerCollege.addDepartment("软件工程");

        Iterator<Department> computerIterator = computerCollege.iterator();
        while (computerIterator.hasNext()) {
            System.out.println(computerIterator.next().getName());
        }

        College infoCollege = new InfoCollege("信息学院");
        infoCollege.addDepartment("信息安全");
        infoCollege.addDepartment("软件安全");
        infoCollege.addDepartment("网络安全");
        infoCollege.addDepartment("数据安全");

        Iterator<Department> infoIterator = infoCollege.iterator();
        while (infoIterator.hasNext()) {
            System.out.println(infoIterator.next().getName());
        }
    }
}

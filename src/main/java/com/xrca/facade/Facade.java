package com.xrca.facade;

/**
 * @author xrca
 * @description 外观模式（门面模式）
 * @date 2020-06-25 15:23
 */
public class Facade {
    private SubSystem$A subSystem$A = new SubSystem$A();
    private SubSystem$B subSystem$B = new SubSystem$B();
    private SubSystem$C subSystem$C = new SubSystem$C();

    public void work() {
        subSystem$A.work();
        subSystem$B.work();
        subSystem$C.work();
    }
}

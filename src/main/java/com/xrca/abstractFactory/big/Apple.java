package com.xrca.abstractFactory.big;

import com.xrca.abstractFactory.Phone;

/**
 * @author xrca
 * @description 苹果手机
 * @date 2020-06-25 1:17
 */
public class Apple extends Phone {
    @Override
    public void surfing() {
        System.out.println("iPhone 11...");
    }
}

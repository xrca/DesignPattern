package com.xrca.abstractFactory.middle;

import com.xrca.abstractFactory.Game;

/**
 * @author xrca
 * @description 魔兽世界
 * @date 2020-06-25 1:18
 */
public class WOW extends Game {

    @Override
    public void play() {
        System.out.println("圣光会制裁你...");
    }
}

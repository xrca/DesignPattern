package com.xrca.abstractFactory.big;

import com.xrca.abstractFactory.Game;

/**
 * @author xrca
 * @description 塞尔达
 * @date 2020-06-25 1:19
 */
public class Zelda extends Game {

    @Override
    public void play() {
        System.out.println("卑鄙的海拉鲁人...");
    }
}

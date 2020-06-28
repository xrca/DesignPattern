package com.xrca.observer;

import java.util.Observable;

/**
 * @author xrca
 * @description 主程序
 * @date 2020-06-28 23:34
 */
public class Main {
    public static void main(String[] args) {
        WeatherConditions weatherConditions = new WeatherConditions();

        Baidu baidu = new Baidu();
        Sina sina = new Sina();

        weatherConditions.add(baidu);
        weatherConditions.add(sina);

        weatherConditions.changeData(30.0f, 23.4f, 17.5f);
    }
}

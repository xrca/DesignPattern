package com.xrca.observer;

/**
 * @author xrca
 * @description 新浪天气
 * @date 2020-06-28 23:41
 */
public class Sina implements Observer {

    @Override
    public void update(Subject subject) {
        WeatherConditions weatherConditions = (WeatherConditions) subject;
        System.out.println("=========== 新浪天气 ===========");
        System.out.println("=========== 温度：" + weatherConditions.getTemperature());
        System.out.println("=========== 气压：" + weatherConditions.getPressure());
        System.out.println("=========== 湿度：" + weatherConditions.getHumidity());
    }
}

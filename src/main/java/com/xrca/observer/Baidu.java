package com.xrca.observer;

/**
 * @author xrca
 * @description 百度天气
 * @date 2020-06-28 23:41
 */
public class Baidu implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("=========== 百度天气 ===========");
        WeatherConditions weatherConditions = (WeatherConditions) subject;
        System.out.println("=========== 温度：" + weatherConditions.getTemperature());
        System.out.println("=========== 气压：" + weatherConditions.getPressure());
        System.out.println("=========== 湿度：" + weatherConditions.getHumidity());
    }
}

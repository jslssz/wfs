package com.hx.wfs.weather.report.controller;

import com.hx.wfs.weather.report.feign.WeatherService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-10-26 17:00
 */
@RestController
public class DataController {

    @Autowired WeatherService weatherService;

    @RequestMapping(value = "report/cityId/{cityId}",produces = "application/json;charset=UTF-8")
    @HystrixCommand(fallbackMethod = "hystrixCommand")
    public String getWeatherByCityId(@PathVariable String cityId) throws Exception {
        if (cityId.equals("110")) {
            throw new Exception("非法");
        }
        return weatherService.getWeatherByCityId(cityId);
    }


    public String hystrixCommand(@PathVariable String cityId) {
        return "服务熔断"+cityId+"城市数据不存在";
    }
}

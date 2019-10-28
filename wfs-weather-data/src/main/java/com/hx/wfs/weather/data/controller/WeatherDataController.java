package com.hx.wfs.weather.data.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-10-22 21:42
 */
@RestController
public class WeatherDataController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @RequestMapping(value = "weather/cityId/{cityId}",produces = "application/json;charset=UTF-8")
    @HystrixCommand(fallbackMethod = "hystrixCommand")
    public String getWeatherByCityId(@PathVariable String cityId) throws Exception {
        if (cityId.equals("110")) {
            throw new Exception("非法");
        }
        String pre = cityId.substring(0, 5)+":";
        String suff =cityId.substring(5);
        return stringRedisTemplate.opsForValue().get(pre + suff);
    }
    public String hystrixCommand(@PathVariable String cityId) {
        return "服务熔断"+cityId+"城市数据不存在";
    }

}

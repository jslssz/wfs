package com.hx.wfs.weather.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
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
    public String getWeatherByCityId(@PathVariable String cityId){
        String pre = cityId.substring(0, 5)+":";
        String suff =cityId.substring(5);
        return stringRedisTemplate.opsForValue().get(pre + suff);
    }
}

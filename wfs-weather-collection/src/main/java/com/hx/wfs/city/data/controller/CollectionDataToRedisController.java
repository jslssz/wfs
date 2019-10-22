package com.hx.wfs.city.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-10-22 13:58
 */
@RestController
public class CollectionDataToRedisController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("redis")
    public String collectionDataToRedis() {
        stringRedisTemplate.opsForValue().set("stringValue","bbb");
        return "success";
    }
}

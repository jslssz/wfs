package com.hx.wfs.city.data.controller;

import com.hx.wfs.city.data.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jxlgcmh
 * @date 2019-10-22 13:58
 */
@RestController
public class CollectionDataToRedisController {
    // alibabaAPI
    public static final String APPCODE = "0793400e45ee448eb0dd34833c17c7e3";
    public static final String APPID = "75654252";
    public static final String APPSECRET = "N3JeoicB";
    public static final String VERSION = "v1";

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("redis/{cityId}")
    public String collectionDataToRedis(@PathVariable String cityId) {
        /**
         * String host = "https://weather01.market.alicloudapi.com";
         * String path = "/day15";
         * String method = "GET";
         * Map<String, String> headers = new HashMap<>();
         * headers.put("Authorization", "APPCODE " + "");
         * Map<String, String> querys = new HashMap<>();
         * querys.put("area", "丽江");
         * querys.put("areaid", "101230506");
         */

        String host = "https://www.tianqiapi.com";
        String path = "/api/";
        String method = "GET";
        Map<String, String> querys = new HashMap<>();
        querys.put("version", VERSION);
        querys.put("appid", APPID);
        querys.put("appsecret", APPSECRET);
        querys.put("cityid", cityId);

        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, null, querys);
            //创建不同的key  将key分组
            String pre = cityId.substring(0, 5)+":";
            String suff =cityId.substring(5);
            stringRedisTemplate.opsForValue().set(pre+suff, EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}

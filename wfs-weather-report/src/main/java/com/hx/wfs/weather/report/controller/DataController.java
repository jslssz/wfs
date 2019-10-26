package com.hx.wfs.weather.report.controller;

import com.hx.wfs.weather.report.feign.WeatherService;
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
    public String getWeatherByCityId(@PathVariable String cityId) {
        return weatherService.getWeatherByCityId(cityId);
    }
}

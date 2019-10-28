package com.hx.wfs.weather.report.feign;

import com.hx.wfs.weather.report.fallback.WeatherServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jxlgcmh
 * @date 2019-10-26 16:57
 */
@FeignClient(value = "wfs-getway-zuul",fallbackFactory = WeatherServiceFallBack.class)
public interface WeatherService {
    /**
     *  通过城市id获取天气数据
     * @param cityId
     * @return
     */
    @RequestMapping("/data/weather/cityId/{cityId}")
    String getWeatherByCityId(@PathVariable String cityId);
}

package com.hx.wfs.weather.report.fallback;

import com.hx.wfs.weather.report.feign.WeatherService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author jxlgcmh
 * @data 2019-10-28 23:09
 */
@Component
public class WeatherServiceFallBack implements FallbackFactory<WeatherService> {

    @Override
    public WeatherService create(Throwable throwable) {
        return cityId -> "服务正在维护中，请稍后再来！";
    }
}

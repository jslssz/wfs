package com.hx.wfs.weather.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jxlgcmh
 * @date 2019-10-22 21:41
 */
@SpringBootApplication
@EnableEurekaClient
public class WfsWeatherDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(WfsWeatherDataApplication.class,args);
    }
}

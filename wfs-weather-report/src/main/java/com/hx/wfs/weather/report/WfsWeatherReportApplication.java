package com.hx.wfs.weather.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jxlgcmh
 * @date 2019-10-26 15:35
 */
@SpringBootApplication
@EnableEurekaClient
public class WfsWeatherReportApplication {
    public static void main(String[] args) {
        SpringApplication.run(WfsWeatherReportApplication.class,args);
    }
}

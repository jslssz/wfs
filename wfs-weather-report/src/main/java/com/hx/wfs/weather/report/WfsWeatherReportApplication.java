package com.hx.wfs.weather.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jxlgcmh
 * @date 2019-10-26 15:35
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.hx.wfs.weather.report.feign")
@EnableHystrixDashboard
public class WfsWeatherReportApplication {
    public static void main(String[] args) {
        SpringApplication.run(WfsWeatherReportApplication.class,args);
    }
}

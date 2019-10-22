package com.hx.wfs.city.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jxlgcmh
 * @date 2019-10-22 13:13
 */
@SpringBootApplication
@EnableEurekaClient
public class WfsWeatherCollectionApplication {
    public static void main(String[] args) {
        SpringApplication.run(WfsWeatherCollectionApplication.class,args);
    }
}

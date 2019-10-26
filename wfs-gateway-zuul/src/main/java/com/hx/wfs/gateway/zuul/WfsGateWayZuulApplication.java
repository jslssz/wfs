package com.hx.wfs.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jxlgcmh
 * @date 2019-10-26 16:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class WfsGateWayZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(WfsGateWayZuulApplication.class,args);
    }
}

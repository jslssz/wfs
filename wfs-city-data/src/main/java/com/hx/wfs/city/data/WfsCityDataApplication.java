package com.hx.wfs.city.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hx.wfs.city.data.mapper")
public class WfsCityDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(WfsCityDataApplication.class, args);
    }

}

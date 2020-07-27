package com.sugar.Eurkea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author wangshu
 * @Date 2020/7/20 14:14
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurkeaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkeaApplication.class, args);
    }
}

package com.demo.dubbo.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangmingshuang
 * @since 2020/1/10
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.demo.dubbo.service.impl")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}

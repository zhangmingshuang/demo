package com.demo.dubbo.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhangmingshuang
 * @since 2020/1/10
 */
@Service(version = "1.0.0")
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHai(String name) {
        return "hai! " + name;
    }
}

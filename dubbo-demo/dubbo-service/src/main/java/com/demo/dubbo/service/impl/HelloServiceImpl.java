package com.demo.dubbo.service.impl;

import com.demo.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zhangmingshuang
 * @since 2020/1/10
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHai(String name) {
        return "hai! " + name;
    }
}

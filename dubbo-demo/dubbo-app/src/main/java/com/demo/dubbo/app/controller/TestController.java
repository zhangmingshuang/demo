package com.demo.dubbo.app.controller;

import com.demo.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangmingshuang
 * @since 2020/1/15
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/sayHai")
    public String sayHai(String name) {
        return helloService.sayHai(name);
    }
}

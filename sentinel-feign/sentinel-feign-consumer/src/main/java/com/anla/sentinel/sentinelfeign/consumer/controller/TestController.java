package com.anla.sentinel.sentinelfeign.consumer.controller;

import com.example.demo.sentinel.feign.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoan
 * @version 1.0
 * @date 2019/9/25 9:50
 **/
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello-feign/{str}")
    public String feign(@PathVariable int str) {
        return helloService.hello(str);
    }

}
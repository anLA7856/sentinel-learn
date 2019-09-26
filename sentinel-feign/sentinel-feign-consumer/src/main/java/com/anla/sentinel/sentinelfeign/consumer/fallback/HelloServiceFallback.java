package com.anla.sentinel.sentinelfeign.consumer.fallback;

import com.example.demo.sentinel.feign.consumer.service.HelloService;

/**
 * 熔断 例子
 * @author luoan
 * @version 1.0
 * @date 2019/9/25 9:56
 **/
public class HelloServiceFallback implements HelloService {

    private Throwable throwable;

    HelloServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String hello(int hello) {
        return "fallback string :" + hello;
    }
}

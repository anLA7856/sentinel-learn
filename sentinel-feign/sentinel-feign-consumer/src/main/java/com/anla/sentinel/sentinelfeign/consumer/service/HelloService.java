package com.anla.sentinel.sentinelfeign.consumer.service;

import com.example.demo.sentinel.feign.consumer.fallback.HelloServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luoan
 * @version 1.0
 * @date 2019/9/25 9:51
 **/
@FeignClient(name = "service-provider", fallbackFactory = HelloServiceFallbackFactory.class)
public interface HelloService {

    /**
     * 调用服务提供方的输出接口
     *
     * @param hello 用户输入
     * @return
     */
    @GetMapping("/hello")
    String hello(@RequestParam("id") int hello);
}

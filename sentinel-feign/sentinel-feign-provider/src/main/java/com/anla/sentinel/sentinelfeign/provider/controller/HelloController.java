package com.anla.sentinel.sentinelfeign.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoan
 * @version 1.0
 * @date 2019/9/25 10:05
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello(@RequestParam("id") int hello){
        if (hello == 1001){
            throw new RuntimeException("故意报错");
        }else {
            return "provider-" + hello;
        }
    }

}

package com.anla.sentinel.sentinelfeign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author luoan
 * @version 1.0
 * @date 2019/9/25 9:50
 **/
@EnableFeignClients
@SpringCloudApplication
public class FeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }
}

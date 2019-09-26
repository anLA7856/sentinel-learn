package com.anla.sentinel.sentinelfeign.consumer.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author luoan
 * @version 1.0
 * @date 2019/9/25 9:52
 **/
@Component
public class HelloServiceFallbackFactory implements FallbackFactory<HelloServiceFallback> {
    @Override
    public HelloServiceFallback create(Throwable throwable) {
        return new HelloServiceFallback(throwable);
    }
}

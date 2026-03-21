package com.jguzman.consumer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="provider-service", url="http://localhost:8081")
public interface OpenFeignClient {

    @GetMapping("/api/instance")
    String getInstanceInfo();
}

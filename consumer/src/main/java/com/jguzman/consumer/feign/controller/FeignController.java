package com.jguzman.consumer.feign.controller;

import com.jguzman.consumer.feign.client.OpenFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FeignController {

    private final OpenFeignClient openFeignClient;

    @GetMapping
    public String getInstance(){
        String response = openFeignClient.getInstanceInfo();
        return "Response Feign: " + response;
    }
}

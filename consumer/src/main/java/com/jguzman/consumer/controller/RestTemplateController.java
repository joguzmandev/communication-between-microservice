package com.jguzman.consumer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/api/rest-template")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplate restTemplate;

    private final String URL_INSTANCE_SERVICE = "http://localhost:8080/api/instance";

    @GetMapping
    public String getInstance(){
        log.info("===>> Calling getInstance from /api/rest-template");
        return restTemplate.getForObject(URL_INSTANCE_SERVICE,String.class);
    }
}

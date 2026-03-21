package com.jguzman.consumer.controller;

import com.jguzman.consumer.service.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpTimeoutException;

@Slf4j
@RestController
@RequestMapping("/api/rest-template")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateClient restTemplateClient;


    @GetMapping
    public String getInstance(){
        log.info("===>> Calling getInstance from /api/rest-template");
        return restTemplateClient.getInstance();
    }
}

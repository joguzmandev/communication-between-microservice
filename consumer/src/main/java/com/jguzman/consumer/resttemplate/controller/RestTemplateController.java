package com.jguzman.consumer.resttemplate.controller;

import com.jguzman.consumer.resttemplate.service.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

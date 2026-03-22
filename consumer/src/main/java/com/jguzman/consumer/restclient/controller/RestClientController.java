package com.jguzman.consumer.restclient.controller;

import com.jguzman.consumer.restclient.service.RestClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@Slf4j
@RestController
@RequestMapping("/api/rest-client")
@RequiredArgsConstructor
public class RestClientController {

    private final RestClientService restClientService;

    @GetMapping
    public String getInstance(){
        log.info("===>> Calling getInstance from /api/rest-client");
        return restClientService.getInstance();
    }
}

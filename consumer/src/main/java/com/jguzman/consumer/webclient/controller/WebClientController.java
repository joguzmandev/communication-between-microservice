package com.jguzman.consumer.webclient.controller;

import com.jguzman.consumer.webclient.service.WebClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/web-client")
@RequiredArgsConstructor
public class WebClientController {

    private final WebClientService webClientService;

    @GetMapping
    public Mono<String> getInstance(){
        return webClientService.getInstance();
    }

}

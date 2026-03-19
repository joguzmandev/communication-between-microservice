package com.jguzman.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/instance")
public class InstanceController {

    @Value("${server.port}")
    private String serverPort;

    private final String instanceUUID = java.util.UUID.randomUUID().toString();

    @GetMapping
    public String getInstanceInfo(){
        log.info("===>> Calling getInstance from /api/instance");
        return "Getting data from server port " + serverPort + " and UUID Instance " + instanceUUID;
    }
}

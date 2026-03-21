package com.jguzman.consumer.resttemplate.service.impl;

import com.jguzman.consumer.resttemplate.service.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service
@RequiredArgsConstructor
public class RestTemplateImpl implements RestTemplateClient {

    private final RestTemplate restTemplate;

    @Value("${provider-ser.url}")
    private String URL_INSTANCE_SERVICE;

    @Override
    public String getInstance(){
        return restTemplate.getForObject(URL_INSTANCE_SERVICE, String.class);
    }
}

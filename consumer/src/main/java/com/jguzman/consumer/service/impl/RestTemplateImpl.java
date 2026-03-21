package com.jguzman.consumer.service.impl;

import com.jguzman.consumer.service.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpClient;


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

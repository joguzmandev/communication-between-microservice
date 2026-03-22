package com.jguzman.consumer.restclient.service.impl;

import com.jguzman.consumer.restclient.service.RestClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class RestClientServiceImpl implements RestClientService {

    @Value("${provider-ser.url}")
    private String URL_INSTANCE_SERVICE;

    private final RestClient restClient;

    @Override
    public String getInstance(){
        return restClient.get()
                .uri(URL_INSTANCE_SERVICE)
                .retrieve()
                .body(String.class);
    }
}

package com.jguzman.consumer.webclient.service.imp;

import com.jguzman.consumer.webclient.service.WebClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebClientServiceImpl implements WebClientService {

    private final WebClient webClient;

    @Value("${provider-ser.url}")
    private String URL_INSTANCE_SERVICE;

    @Override
    public Mono<String> getInstance(){

        return webClient.get()
                .uri(URL_INSTANCE_SERVICE)
                .retrieve()
                .bodyToMono(String.class);
    }
}

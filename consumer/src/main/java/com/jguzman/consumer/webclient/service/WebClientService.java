package com.jguzman.consumer.webclient.service;

import reactor.core.publisher.Mono;

public interface WebClientService {
    Mono<String> getInstance();
}

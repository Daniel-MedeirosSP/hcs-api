package com.medeiros.hcs.infra;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @Qualifier("dragonballApi")
    public WebClient dragonballWebClient(WebClient.Builder builder) {
        return builder.baseUrl("https://dragonball-api.com/api" ).build();
    }
}

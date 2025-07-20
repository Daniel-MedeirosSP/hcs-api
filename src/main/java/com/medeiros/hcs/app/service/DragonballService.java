package com.medeiros.hcs.app.service;

import com.medeiros.hcs.app.dto.CharacterDto;
import com.medeiros.hcs.app.dto.CharactersDto;
import com.medeiros.hcs.app.dto.PlanetsDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class DragonballService {

    private final WebClient webClient;

    public DragonballService(@Qualifier("dragonballApi") WebClient webClient) {
        this.webClient = webClient;
    }

    @Value("${base_api_dragonball}")
    private String apiUrl;

    @Value("${base_api_dragonball_collect}")
    private String limit;

    private static final String CHARACTERS_ENDPOINT = "/characters";
    private static final String PLANETS_ENDPOINT = "/planets";

    public CharactersDto findCharacters() {
        return accessDragonballApi(apiUrl+CHARACTERS_ENDPOINT+limit);
 // Replace with actual parsing logic

    }

    public CharactersDto accessDragonballApi(String endpoint) {
        return this.webClient
                .get() // Método HTTP GET
                .uri(uriBuilder -> uriBuilder
                        .path(CHARACTERS_ENDPOINT)
                        .queryParam("limit", 100)
                        .build())
                .retrieve() // Executa a requisição
                .bodyToMono(CharactersDto.class).block();
    }

    public PlanetsDto findPlanets() {
        return this.webClient
                .get() // Método HTTP GET
                .uri(uriBuilder -> uriBuilder
                        .path(PLANETS_ENDPOINT)
                        .queryParam("limit", 100)
                        .build())
                .retrieve() // Executa a requisição
                .bodyToMono(PlanetsDto.class).block();
    }

    public CharacterDto findCharacter(String id) {
        return this.webClient
                .get() // Método HTTP GET
                .uri(uriBuilder -> uriBuilder
                        .path(CHARACTERS_ENDPOINT+"/" + id)
//                        .queryParam("limit", 100)
                        .build())
                .retrieve() // Executa a requisição
                .bodyToMono(CharacterDto.class).block();
    }
}

package com.basic.assessment.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class FootballService {

    RestTemplate restTemplate = new RestTemplate();

    @Value("${football.api.baseurl}")
    String baseUrl;

    @Value("${football.apikey}")
    String apiKey;

    public HttpEntity<String> getCountries() {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("action", "get_countries")
                .queryParam("APIkey", apiKey);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                String.class);
        System.out.println("URL:" + builder.toUriString());
        System.out.println("Response:" + response);
        return response;

    }

    public HttpEntity<String> getLeagues() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("action", "get_leagues")
                .queryParam("APIkey", apiKey);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                String.class);
        System.out.println("URL:" + builder.toUriString());
        System.out.println("Response:" + response);
        return response;
    }

    public HttpEntity<String> getTeams() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("action", "get_teams")
                .queryParam("league_id","149")
                .queryParam("APIkey", apiKey);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                String.class);
        System.out.println("URL:" + builder.toUriString());
        System.out.println("Response:" + response);
        return response;
    }

    public HttpEntity<String> getStandings() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("action", "get_standings")
                .queryParam("league_id","149")
                .queryParam("APIkey", apiKey);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                String.class);
        System.out.println("URL:" + builder.toUriString());
        System.out.println("Response:" + response);
        return response;
    }

}

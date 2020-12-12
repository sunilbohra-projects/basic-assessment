package com.basic.assessment.controller;

import com.basic.assessment.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballController {
    @Autowired
    FootballService footballService;


    @GetMapping("/get_countries")
    public HttpEntity<String> getCountries() {
        return footballService.getCountries();
    }

    @GetMapping("/get_leagues")
    public HttpEntity<String> getLeagues() {
        return  footballService.getLeagues();

    }

    @GetMapping("/get_teams")
    public HttpEntity<String> getTeams() {
        return footballService.getTeams();
    }

    @GetMapping("/get_positions")
    public HttpEntity<String> getStandings() {
        return footballService.getStandings();
    }

}

package com.example.weather_podcast.controller;

import com.example.weather_podcast.service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class weatherController {

    @Autowired
    private weatherService weatherService;

    @GetMapping
    public ResponseEntity<String> getWeather(@RequestParam String city){
        String weatherData = weatherService.getWeatherData(city);
        return ResponseEntity.ok(weatherData);
    }



}

package com.example.weather_podcast.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class weatherService {

    private final String API_KEY="5c3922a8a77f22dacb2050a28cb75793";

    public String getWeatherData(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + API_KEY + "&units=metric";
        return restTemplate.getForObject(url,String.class);
    }
}

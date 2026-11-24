package com.example.user.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.WeatherResponse;

@Service
public class WeatherService {
	
	private final String apiKey = "a1d35e17d6277d31527cfcb3e51dc767"; // replace with your key
    private final String url = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}&units=metric";

    public WeatherResponse getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WeatherResponse.class, city, apiKey);
    }


}

package com.project.sentimentapi.service;

import com.project.sentimentapi.dto.RespuestasDto;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class SentimentServiceImplement implements SentimentService {

    public RestTemplate getRestemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    public RespuestasDto consultaSentiment(String texto) {
        String urlPython = "http://localhost:8000/sentiment";
        // Creamos el objeto que espera Python
        Map<String, String> request = new HashMap<>();
        request.put("text", texto);
        // Enviamos y recibimos
        getRestemplate().postForObject(urlPython, request, SentimentServiceImplement.class);
        return new RespuestasDto();
    }

}

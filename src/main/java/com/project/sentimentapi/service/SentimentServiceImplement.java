package com.project.sentimentapi.service;

import com.project.sentimentapi.configuration.ConectarApi;
import com.project.sentimentapi.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientRequestException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class SentimentServiceImplement implements SentimentService {
    @Autowired
    ConectarApi conectarApi;

    public Optional<ResponseDto> consultarSentimiento(String texto) {
        try {
            Map<String, String> request = new HashMap<>();
            request.put("text", texto);
            ResponseDto responseDto = conectarApi.client().post().uri("/sentiment").bodyValue(request).
                    retrieve().bodyToMono(ResponseDto.class).block();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= responseDto.getEstrellas(); i++) {
                if (i != responseDto.getEstrellas()) {
                    stringBuilder.append("\u2605" + " ");
                } else {
                    stringBuilder.append("\u2605");
                }
            }
            responseDto.setCalificación(stringBuilder.toString());
            System.out.println(responseDto.getEstrellas());
            return Optional.of(responseDto);
        } catch (WebClientRequestException e) {
            return Optional.empty();
        }
    }
}

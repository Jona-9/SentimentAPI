package com.project.sentimentapi.service;

import com.project.sentimentapi.dto.RespuestasDto;
import org.springframework.web.client.RestTemplate;

public interface SentimentService  {
     RestTemplate getRestemplate();
     RespuestasDto consultaSentiment (String texto);
}

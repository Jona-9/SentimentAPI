package com.project.sentimentapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentiment/analyze")
public class SentimentApiController {
    @GetMapping
    public String mensajeDePrueba(){
        return "retornando mensaje de prueba";
    }
}

package com.project.sentimentapi.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sentiment/analyze")
@Validated
public class SentimentApiController {
    @GetMapping
    public String mensajeDePrueba() {
        return "retornando mensaje de prueba";
    }

    @PostMapping
    public String postMensaje(@NotBlank(message = "Se ha ingresado un mensaje vacio")
                              @Size(min = 10, message = "El texto ingresado debe contener más de 10 carácteres")
                              @RequestBody(required = false) String mensaje) {
        return mensaje;
    }
}

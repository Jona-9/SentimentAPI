package com.project.sentimentapi.dto;

import lombok.Data;

@Data
public class RespuestasDto {
    private String texto;
    private String prevision;
    private Double probabilidad;
}

package br.com.fujideia.iesp.tecback.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GeneroDTO {
    private int id;

    private String titulo;

    private String subtitulo;
}

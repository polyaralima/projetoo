package br.com.fujideia.iesp.tecback.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SerieDTO {
    private Integer id;
    private String titulo;
}

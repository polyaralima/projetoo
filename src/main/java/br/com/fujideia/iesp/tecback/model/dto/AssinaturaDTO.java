package br.com.fujideia.iesp.tecback.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AssinaturaDTO {
    private Long id;

    private String nome;

    private Double preco;
}


package br.com.fujideia.iesp.tecback.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AnimaçãoDTO {

    private Integer id;
    private String titulo;
    private String sinopse;

}

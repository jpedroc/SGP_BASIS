package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class SelectDTO {
    @NotNull
    private Long value;
    @NotNull
    private String label;
}

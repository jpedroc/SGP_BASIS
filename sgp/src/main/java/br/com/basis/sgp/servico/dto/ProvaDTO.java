package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ProvaDTO {
    @NotNull
    private Long id;

    @NotNull
    @Size(max = 80, message = "Título inválido")
    private String titulo;

    @NotNull
    @Size(min=0, max=100, message = "Percentual inválido")
    private Double percentual_aprovacao;
}

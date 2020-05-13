package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
public class AvaliacaoDTO {
    @NotNull
    private Long id;

    @NotNull(message = "Data inválida")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String data_avaliacao;

    @NotNull
    @Size(min=0, max=100, message = "Aproveitamento inválido")
    private Double aproveitamento;
}

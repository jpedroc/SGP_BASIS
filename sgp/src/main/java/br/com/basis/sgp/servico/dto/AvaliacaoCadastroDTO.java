package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public class AvaliacaoCadastroDTO {
    private Long id;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private String data_avaliacao;
    private Double aproveitamento;
}

package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class QuestaoDTO {
    @NotNull
    private Long id;

    @NotNull
    @Size(max = 400, message = "Descricao inválida")
    private String descricao;

//    @NotNull(message = "Senioridade inválida")
//    private String senioridade;
//
//    @NotNull(message = "Tipo questão inválida")
//    private String tipo_questao;
}

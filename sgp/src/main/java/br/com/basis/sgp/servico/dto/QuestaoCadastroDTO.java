package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class QuestaoCadastroDTO {
    @NotNull
    private Long id;

    @NotNull
    @Size(max= 400, message = "Descrição inválida")
    private String descricao;

//    @NotNull(message = "Senioridade inválida")
//    private String senioridade;
//
//    @NotNull(message = "Tipo questão inválida")
//    private String tipo_questao;

    @NotNull
    @Size(max= 400, message = "Primeira alternativa inválida")
    private String alternativa1;

    @NotNull
    @Size(max= 400, message = "Segunda alternativa inválida")
    private String alternativa2;

    @NotNull
    @Size(max= 400, message = "Terceira alternativa inválida")
    private String alternativa3;

    @NotNull
    @Size(max= 400, message = "Quarta alternativa inválida")
    private String alternativa4;

    @NotNull
    @Size(max= 400, message = "Quinta alternativa inválida")
    private String alternativa5;

    @NotNull
    @Size(min= 1, max = 5, message = "Resposta inválida")
    private Integer resposta;
}

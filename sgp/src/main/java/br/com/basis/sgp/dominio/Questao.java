package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Questao {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String descricao;

    private String alternativa1;

    private String alternativa2;

    private String alternativa3;

    private String alternativa4;

    private String alternativa5;

    private Long responsta;

    @ManyToOne
    @JoinColumn(name = "id_senioridade")
    private Senioridade senioridade;

    @ManyToOne
    @JoinColumn(name = "id_tipo_questao")
    private TipoQuestao tipo_questao;
}

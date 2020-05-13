package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "QUESTAO")
public class Questao {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="DESCRICAO", nullable = false)
    private String descricao;

    @Column(name="ALTERNATIVA1", nullable = false)
    private String alternativa1;

    @Column(name="ALTERNATIVA2", nullable = false)
    private String alternativa2;

    @Column(name="ALTERNATIVA3", nullable = false)
    private String alternativa3;

    @Column(name="ALTERNATIVA4", nullable = false)
    private String alternativa4;

    @Column(name="ALTERNATIVA5", nullable = false)
    private String alternativa5;

    @Column(name="RESPOSTA", nullable = false)
    private Long responsta;

}

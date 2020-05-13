package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Avaliacao {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="DATA_AVALIACAO", nullable = false)
    private String data_avaliacao;

    @Column(name="APROVEITAMENTO", nullable = false)
    private Double aproveitamento;

    @ManyToOne
    @JoinColumn(name = "ID_CANDIDATO", nullable = false)
    private Usuario candadidato;

    @ManyToOne
    @JoinColumn(name = "ID_PROVA", nullable = false)
    private Prova prova;

}

package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Avaliacao {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date data_avaliacao;

    @NotNull
    @Size(min = 0, max = 100)
    private Double aproveitamento;

    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Usuario candadidato;

    @ManyToOne
    @JoinColumn(name = "id_prova")
    private Prova prova;

}

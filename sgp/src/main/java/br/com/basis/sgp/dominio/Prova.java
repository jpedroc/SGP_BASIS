package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Prova {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String titulo;

    @NotNull
    @Size(min = 0, max = 100)
    private Double percentual_aprovacao;

    @ManyToMany
    @JoinTable(
            name="prova_questao",
            joinColumns = @JoinColumn(name="id_prova"),
            inverseJoinColumns = @JoinColumn(name="id_questao"))
    private List<Questao> questoes = new ArrayList<>();
}

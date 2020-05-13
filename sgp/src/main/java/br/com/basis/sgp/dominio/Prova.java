package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "PROVA")
public class Prova {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="TITULO", nullable = false)
    private String titulo;

    @Column(name="PERCENTULA_APROVACAO", nullable = false)
    private Double percentual_aprovacao;

    @ManyToMany
    @JoinTable(
            name="PROVA_QUESTAO",
            joinColumns = @JoinColumn(name="ID_PROVA" ,nullable = false),
            inverseJoinColumns = @JoinColumn(name="ID_QUESTAO", nullable = false))
    private List<Questao> questoes = new ArrayList<>();
}

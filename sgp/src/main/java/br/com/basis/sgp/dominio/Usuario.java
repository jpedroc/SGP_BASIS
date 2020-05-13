package br.com.basis.sgp.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "ADMIN", nullable = false)
    private Integer admin;
}

package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@RequiredArgsConstructor
public class UsuarioCadastroDTO {
    @NotNull
    @Size(min=3, max=80, message = "Nome inválido!")
    private String nome;

    @NotNull
    @Email(message = "Email inválido!")
    private String email;

    @NotNull
    @CPF(message = "CPF inválido!")
    private String cpf;

    @NotNull
    @Size(min= 4, max= 20, message = "Senha inválida")
    private String senha;

    @NotNull(message = "Token obrigatório!")
    private String token;

}

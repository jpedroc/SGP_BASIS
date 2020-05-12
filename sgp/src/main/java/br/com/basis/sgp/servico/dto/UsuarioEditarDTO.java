package br.com.basis.sgp.servico.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@RequiredArgsConstructor
public class UsuarioEditarDTO {

    @NotNull(message = "Id não informado!")
    private Long id;

    @NotNull
    @Size(min=3 , max=80, message = "Nome inválido!")
    private String nome;

    @NotNull
    @Email(message = "Email inválido")
    private String email;

    @Size(max=20, message = "Senha inválida")
    private String senha;
}

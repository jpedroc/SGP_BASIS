package br.com.basis.sgp.servico;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.UsuarioCadastroDTO;
import br.com.basis.sgp.servico.dto.UsuarioDTO;
import br.com.basis.sgp.servico.dto.UsuarioEditarDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioServico {

    public List<UsuarioDTO> listar();

    public UsuarioDTO cadastrar(UsuarioCadastroDTO usuarioCadastroDTO);

    public UsuarioDTO editar(UsuarioEditarDTO usuarioEditarDTO);

    public void deletar(Long id);
}

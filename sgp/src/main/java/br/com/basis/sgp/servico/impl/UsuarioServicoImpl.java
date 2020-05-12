package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.UsuarioServico;
import br.com.basis.sgp.servico.dto.UsuarioCadastroDTO;
import br.com.basis.sgp.servico.dto.UsuarioDTO;
import br.com.basis.sgp.servico.dto.UsuarioEditarDTO;
import br.com.basis.sgp.servico.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServicoImpl implements UsuarioServico {

    private final UsuarioMapper usuarioMapper;

    @Override
    public List<UsuarioDTO> listar(List<Usuario> usuarios) {
        List<UsuarioDTO> usuariosDTO = usuarioMapper.toDto(usuarios);
        return usuariosDTO;
    }

    @Override
    public UsuarioDTO editar(UsuarioEditarDTO usuarioEditarDTO) {
        return null;
    }

    @Override
    public UsuarioDTO cadastrar(UsuarioCadastroDTO usuarioCadastroDTO) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }
}

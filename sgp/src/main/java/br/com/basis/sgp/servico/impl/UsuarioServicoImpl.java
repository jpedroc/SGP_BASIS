package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.UsuarioServico;
import br.com.basis.sgp.servico.dto.UsuarioCadastroDTO;
import br.com.basis.sgp.servico.dto.UsuarioDTO;
import br.com.basis.sgp.servico.dto.UsuarioEditarDTO;
import br.com.basis.sgp.servico.mapper.UsuarioCadastroMapper;
import br.com.basis.sgp.servico.mapper.UsuarioEditarMapper;
import br.com.basis.sgp.servico.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServicoImpl implements UsuarioServico {

    private final UsuarioMapper usuarioMapper;
    private final UsuarioEditarMapper usuarioEditarMapper;
    private final UsuarioCadastroMapper usuarioCadastroMapper;

    @Override
    public List<UsuarioDTO> listar() {
        Usuario usuario = new Usuario();
        usuario.setEmail("tesste@teste");
        return Collections.singletonList(usuarioMapper.toDto(usuario));
    }

    @Override
    public UsuarioDTO editar(UsuarioEditarDTO usuarioEditarDTO) {
        Usuario usuario = usuarioEditarMapper.toEntity(usuarioEditarDTO);
        // salvar o registro no banco -> repositorio
        return usuarioMapper.toDto(usuario);
    }

    @Override
    public UsuarioDTO cadastrar(UsuarioCadastroDTO usuarioCadastroDTO) {
        Usuario usuario = usuarioCadastroMapper.toEntity(usuarioCadastroDTO);
        // salvar o registro no banco -> repositorio
        return usuarioMapper.toDto(usuario);
    }

    @Override
    public void deletar(Long id) {
    }
}

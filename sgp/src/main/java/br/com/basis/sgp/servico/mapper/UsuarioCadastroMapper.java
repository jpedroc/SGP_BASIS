package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.UsuarioCadastroDTO;
import br.com.basis.sgp.servico.dto.UsuarioEditarDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface UsuarioCadastroMapper extends EntityMapper<UsuarioCadastroDTO, Usuario> {
}

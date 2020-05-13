package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.UsuarioEditarDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface UsuarioEditarMapper extends EntityMapper<UsuarioEditarDTO, Usuario> {
}

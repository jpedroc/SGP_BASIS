package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.servico.dto.ProvaCadastroDTO;
import br.com.basis.sgp.servico.dto.ProvaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvaCadastroMapper extends EntityMapper<ProvaCadastroDTO, Prova>{
}

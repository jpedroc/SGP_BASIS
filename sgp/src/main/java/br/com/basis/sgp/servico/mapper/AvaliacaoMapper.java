package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Avaliacao;
import br.com.basis.sgp.servico.dto.AvaliacaoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AvaliacaoMapper extends EntityMapper<AvaliacaoDTO, Avaliacao> {
}

package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Avaliacao;
import br.com.basis.sgp.servico.dto.AvaliacaoCadastroDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AvaliacaoCadastroMapper extends EntityMapper<AvaliacaoCadastroDTO, Avaliacao> {
}

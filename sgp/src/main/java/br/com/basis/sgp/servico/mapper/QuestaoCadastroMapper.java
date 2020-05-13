package br.com.basis.sgp.servico.mapper;

import br.com.basis.sgp.dominio.Questao;
import br.com.basis.sgp.servico.dto.QuestaoCadastroDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface QuestaoCadastroMapper extends EntityMapper<QuestaoCadastroDTO, Questao> {
}

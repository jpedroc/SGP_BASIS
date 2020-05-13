package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.ProvaCadastroDTO;
import br.com.basis.sgp.servico.dto.ProvaDTO;
import br.com.basis.sgp.servico.dto.QuestaoCadastroDTO;
import br.com.basis.sgp.servico.dto.QuestaoDTO;

import java.util.List;

public interface ProvaServico {

    public List<ProvaDTO> listar();

    public ProvaDTO salvar(ProvaCadastroDTO provaCadastroDTO);

    public void deletar(Long id);
}

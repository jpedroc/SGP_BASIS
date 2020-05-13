package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.AvaliacaoCadastroDTO;
import br.com.basis.sgp.servico.dto.AvaliacaoDTO;
import br.com.basis.sgp.servico.dto.ProvaCadastroDTO;
import br.com.basis.sgp.servico.dto.ProvaDTO;

import java.util.List;

public interface AvaliacaoServico {

    public List<AvaliacaoDTO> listar();

    public AvaliacaoDTO salvar(AvaliacaoCadastroDTO avaliacaoCadastroDTO);

    public void deletar(Long id);

}

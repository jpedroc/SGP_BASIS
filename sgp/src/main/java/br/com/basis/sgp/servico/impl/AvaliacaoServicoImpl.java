package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Avaliacao;
import br.com.basis.sgp.servico.AvaliacaoServico;
import br.com.basis.sgp.servico.dto.AvaliacaoCadastroDTO;
import br.com.basis.sgp.servico.dto.AvaliacaoDTO;
import br.com.basis.sgp.servico.mapper.AvaliacaoCadastroMapper;
import br.com.basis.sgp.servico.mapper.AvaliacaoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AvaliacaoServicoImpl implements AvaliacaoServico {

    private final AvaliacaoMapper avaliacaoMapper;
    private final AvaliacaoCadastroMapper avaliacaoCadastroMapper;

    @Override
    public List<AvaliacaoDTO> listar() {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setAproveitamento(80.4);
        return Collections.singletonList(avaliacaoMapper.toDto(avaliacao));
    }

    @Override
    public AvaliacaoDTO salvar(AvaliacaoCadastroDTO avaliacaoCadastroDTO) {
        Avaliacao avaliacao = avaliacaoCadastroMapper.toEntity(avaliacaoCadastroDTO);
        // salva avaliação no banco
        return avaliacaoMapper.toDto(avaliacao);
    }

    @Override
    public void deletar(Long id) {
        // deleta avaliacao do repositorio
    }
}

package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Questao;
import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.QuestaoServico;
import br.com.basis.sgp.servico.dto.QuestaoCadastroDTO;
import br.com.basis.sgp.servico.dto.QuestaoDTO;
import br.com.basis.sgp.servico.mapper.QuestaoCadastroMapper;
import br.com.basis.sgp.servico.mapper.QuestaoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestaoServicoImpl implements QuestaoServico {

    private final QuestaoMapper questaoMapper;
    private final QuestaoCadastroMapper questaoCadastroMapper;

    @Override
    public List<QuestaoDTO> listar() {
        Questao questao = new Questao();
        questao.setDescricao("Quais os pilares da programação orientada a objetos?");
        return Collections.singletonList(questaoMapper.toDto(questao));
    }

    @Override
    public QuestaoDTO salvar(QuestaoCadastroDTO questaoCadastroDTO) {
        Questao questao = questaoCadastroMapper.toEntity(questaoCadastroDTO);
        // salva a questao no banco
        return questaoMapper.toDto(questao);
    }

    @Override
    public void deletar(Long id) {
        // deleta o usuario
    }
}

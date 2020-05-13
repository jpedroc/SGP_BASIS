package br.com.basis.sgp.servico;

import br.com.basis.sgp.servico.dto.*;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface QuestaoServico {

    public List<QuestaoDTO> listar();

    public QuestaoDTO salvar(QuestaoCadastroDTO questaoCadastroDTO);

    public void deletar(Long id);
}

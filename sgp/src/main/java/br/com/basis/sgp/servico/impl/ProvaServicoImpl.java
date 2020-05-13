package br.com.basis.sgp.servico.impl;

import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.servico.ProvaServico;
import br.com.basis.sgp.servico.dto.ProvaCadastroDTO;
import br.com.basis.sgp.servico.dto.ProvaDTO;
import br.com.basis.sgp.servico.mapper.ProvaCadastroMapper;
import br.com.basis.sgp.servico.mapper.ProvaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProvaServicoImpl implements ProvaServico {
    private final ProvaMapper provaMapper;
    private final ProvaCadastroMapper provaCadastroMapper;

    @Override
    public List<ProvaDTO> listar() {
        Prova prova = new Prova();
        prova.setTitulo("Prova 2020-2");
        return Collections.singletonList(provaMapper.toDto(prova));
    }

    @Override
    public ProvaDTO salvar(ProvaCadastroDTO provaCadastroDTO) {
        Prova prova = provaCadastroMapper.toEntity(provaCadastroDTO);
        // salva prova no banco
        return provaMapper.toDto(prova);
    }

    @Override
    public void deletar(Long id) {
        // deleta registro no banco
    }
}

package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.servico.AvaliacaoServico;
import br.com.basis.sgp.servico.dto.AvaliacaoCadastroDTO;
import br.com.basis.sgp.servico.dto.AvaliacaoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/avaliacoes")
@RequiredArgsConstructor
public class AvaliacaoResource {

    public final AvaliacaoServico avaliacaoServico;

    @GetMapping
    public ResponseEntity<List<AvaliacaoDTO>> listar() {
        List<AvaliacaoDTO> avaliacoes = avaliacaoServico.listar();
        return ResponseEntity.ok(avaliacoes);
    }

    @PostMapping
    public ResponseEntity<AvaliacaoDTO> cadastrar(@Valid @RequestBody AvaliacaoCadastroDTO avaliacaoCadastroDTO) {
        AvaliacaoDTO avaliacao = avaliacaoServico.salvar(avaliacaoCadastroDTO);
        return ResponseEntity.ok(avaliacao);
    }

    @PutMapping
    public ResponseEntity<AvaliacaoDTO> editar(@Valid @RequestBody AvaliacaoCadastroDTO avaliacaoCadastroDTO) {
        AvaliacaoDTO avaliacao = avaliacaoServico.salvar(avaliacaoCadastroDTO);
        return ResponseEntity.ok(avaliacao);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        avaliacaoServico.deletar(id);
        return ResponseEntity.ok(null);
    }

}

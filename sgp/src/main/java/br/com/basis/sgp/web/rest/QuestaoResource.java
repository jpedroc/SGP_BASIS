package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.servico.QuestaoServico;
import br.com.basis.sgp.servico.dto.QuestaoCadastroDTO;
import br.com.basis.sgp.servico.dto.QuestaoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/questoes")
@RequiredArgsConstructor
public class QuestaoResource {

    public final QuestaoServico questaoServico;

    @GetMapping
    public ResponseEntity<List<QuestaoDTO>> listar() {
        List<QuestaoDTO> questoes = this.questaoServico.listar();
        return ResponseEntity.ok(questoes);
    }

    @PostMapping
    public ResponseEntity<QuestaoDTO> cadastrar(@Valid @RequestBody QuestaoCadastroDTO questao) {
        QuestaoDTO questaoSalva = this.questaoServico.salvar(questao);
        return ResponseEntity.ok(questaoSalva);
    }

    @PutMapping
    public ResponseEntity<QuestaoDTO> editar(@Valid @RequestBody QuestaoCadastroDTO questao) {
        QuestaoDTO questaoSalva = this.questaoServico.salvar(questao);
        return ResponseEntity.ok(questaoSalva);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        this.questaoServico.deletar(id);
        return ResponseEntity.ok(null);
    }

}

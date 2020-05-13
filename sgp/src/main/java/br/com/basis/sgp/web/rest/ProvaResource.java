package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.servico.ProvaServico;
import br.com.basis.sgp.servico.dto.ProvaCadastroDTO;
import br.com.basis.sgp.servico.dto.ProvaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/provas")
@RequiredArgsConstructor
public class ProvaResource {

    public final ProvaServico provaServico;

    @GetMapping
    public ResponseEntity<List<ProvaDTO>> listar() {
        List<ProvaDTO> provas = provaServico.listar();
        return ResponseEntity.ok(provas);
    }

    @PostMapping
    public ResponseEntity<ProvaDTO> cadastrar(@Valid @RequestBody ProvaCadastroDTO prova) {
        ProvaDTO provaSalva = provaServico.salvar(prova);
        return ResponseEntity.ok(provaSalva);
    }

    @PutMapping
    public ResponseEntity<ProvaDTO> editar(@Valid @RequestBody ProvaCadastroDTO prova) {
        ProvaDTO provaSalva = provaServico.salvar(prova);
        return ResponseEntity.ok(provaSalva);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        this.provaServico.deletar(id);
        return ResponseEntity.ok(null);
    }

}

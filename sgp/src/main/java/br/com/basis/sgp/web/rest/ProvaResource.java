package br.com.basis.sgp.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/provas")
public class ProvaResource {

    @GetMapping
    public ResponseEntity<Void> listar() {
        return (null);
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar() {
        return (null);
    }

    @PutMapping
    public ResponseEntity<Void> editar() {
        return (null);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletar() {
        return (null);
    }

}

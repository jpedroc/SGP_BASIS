package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.UsuarioServico;
import br.com.basis.sgp.servico.dto.UsuarioCadastroDTO;
import br.com.basis.sgp.servico.dto.UsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioResource {

    public UsuarioServico usuarioServico;

    @GetMapping
    public ResponseEntity<Void> listar() {
        //List<UsuarioDTO> usuarios = this.usuarioServico.listar(usariosBD);
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> cadastrar(@Valid @RequestBody UsuarioCadastroDTO usuario) {
        UsuarioDTO usuarioDTO = this.usuarioServico.cadastrar(usuario);
        return ResponseEntity.ok(usuarioDTO);
    }

    @PutMapping
    public ResponseEntity<Void> editar() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Void> deletar() {
        return (null);
    }

}

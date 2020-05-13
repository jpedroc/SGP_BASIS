package br.com.basis.sgp.web.rest;

import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.UsuarioServico;
import br.com.basis.sgp.servico.dto.UsuarioCadastroDTO;
import br.com.basis.sgp.servico.dto.UsuarioDTO;
import br.com.basis.sgp.servico.dto.UsuarioEditarDTO;
import br.com.basis.sgp.servico.mapper.UsuarioEditarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioResource {

    public final UsuarioServico usuarioServico;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar() {
        List<UsuarioDTO> usuarios = this.usuarioServico.listar();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> cadastrar(@Valid @RequestBody UsuarioCadastroDTO usuario) {
        UsuarioDTO usuarioDTO = this.usuarioServico.cadastrar(usuario);
        return ResponseEntity.ok(usuarioDTO);
    }

    @PutMapping
    public ResponseEntity<UsuarioDTO> editar(@Valid @RequestBody UsuarioEditarDTO usuario) {
        UsuarioDTO usuarioDTO = this.usuarioServico.editar(usuario);
        return ResponseEntity.ok(usuarioDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        this.usuarioServico.deletar(id);
        return ResponseEntity.ok(null);
    }

}

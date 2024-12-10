package Api.ApiDoProjeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Api.ApiDoProjeto.model.usuario.DadosAtualizarUsuario;
import Api.ApiDoProjeto.model.usuario.DadosCadatroUsuario;
import Api.ApiDoProjeto.model.usuario.Usuario;
import Api.ApiDoProjeto.model.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RequestMapping
@RestController("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadatroUsuario dados){
        repository.save(new Usuario(dados));
    }
    @GetMapping("/listar")
    public List<Usuario>lista(){
        return repository.findAll();
    }
    @PutMapping
    @Transactional
    public void Atualizar (@RequestBody DadosAtualizarUsuario dados){
        Usuario usuario= repository.getReferenceById(dados.id());
        usuario.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir (@PathVariable Long id){
        repository.deleteById(id);
}
}

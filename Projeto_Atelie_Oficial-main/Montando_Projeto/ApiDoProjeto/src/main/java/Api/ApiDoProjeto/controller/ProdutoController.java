package Api.ApiDoProjeto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import Api.ApiDoProjeto.model.produto.*;
import jakarta.transaction.Transactional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;


    @GetMapping
    public String carregaPaginaProduto(Model model) {
        model.addAttribute("produto", new ProdutoModel());
        return "paginaProduto";
    }

    @PostMapping
    public String salvarProduto(ProdutoModel produto) {
        repository.save(produto);
        return "redirect:/produto";
    }





    @GetMapping("/listar")
    public List<ProdutoModel> listar(){
        return repository.findAll();
    }

    @PutMapping
    @Transactional
    public void Atualizar (@RequestBody DadosAtualizarProduto dados){
        ProdutoModel produto = repository.getReferenceById(dados.id());
        produto.atualizarInformacoes(dados);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

}

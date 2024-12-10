package Api.ApiDoProjeto.model.produto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarProduto (
    @NotNull Long id,
    String modelo,
    String nome,
    String descricao,
   double preco
    ){
    
}

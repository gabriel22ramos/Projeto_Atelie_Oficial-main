package Api.ApiDoProjeto.model.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProduto(
    @NotBlank
    String nome,

    @NotBlank
    String tamanho,

    @NotBlank
    Fabricante fabricante,

    @NotBlank
    String modelo,

    @NotBlank
    String descricao,

    @NotNull
    double preco){

    
}

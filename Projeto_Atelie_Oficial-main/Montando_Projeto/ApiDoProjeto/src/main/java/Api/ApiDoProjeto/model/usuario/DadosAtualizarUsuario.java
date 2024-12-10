package Api.ApiDoProjeto.model.usuario;

import Api.ApiDoProjeto.model.endereco.DadosEndereco;
import jakarta.validation.constraints.*;


public record DadosAtualizarUsuario(

    @NotNull Long id,
    String Nome,
    String Senha,
    String ConfirmarSenha,
    DadosEndereco Endereco,
    String Telefone_1,
    String Telefone_2,
    String DataDeNascimento,  
    char Genero 
    ) {

    
}




package Api.ApiDoProjeto.model.usuario;

import Api.ApiDoProjeto.model.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record DadosCadatroUsuario(

    @NotBlank
    String nome,

    @NotBlank
    String cpf,

    @NotBlank @Email
    String Email,

    @NotBlank
    String Senha,

    @NotBlank
    String ConfirmarSenha,

    @NotNull @Valid
    DadosEndereco Endereco,

    @NotBlank
    String DataDeNascimento,
    
    @NotBlank
    char Genero)
     {    
}














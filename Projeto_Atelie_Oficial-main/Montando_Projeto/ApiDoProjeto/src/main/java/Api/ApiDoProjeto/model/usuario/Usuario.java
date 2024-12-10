package Api.ApiDoProjeto.model.usuario;


import Api.ApiDoProjeto.model.endereco.EnderecoModel;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "usuario")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Cpf;
    private String Nome;
    private String Email;
    private String Senha;
    private String ConfirmarSenha;
    @Embedded
    private EnderecoModel endereco;
    private String Telefone_1;
    private String Telefone_2;
    private String dataDeNascimento;
    private char Genero;

    public void atualizarInformacoes(DadosAtualizarUsuario dados){
        if(dados.Nome() != null){
            this.Nome =dados.Nome();
        }
        if(dados.DataDeNascimento() != null){
            this.dataDeNascimento = dados.DataDeNascimento();
        }
        if(dados.Senha() != null){
            this.Senha = dados.Senha();
        }
        if (dados.ConfirmarSenha() != null){
            this.ConfirmarSenha = dados.ConfirmarSenha();
        }
        if(dados.Endereco() != null){
            this.endereco.atualizarEndereco(dados.Endereco());
        }
        if (dados.Telefone_1() != null) {
            this.Telefone_1 = dados.Telefone_1();
        }
        if (dados.Telefone_2() != null) {
            this.Telefone_2 = dados.Telefone_2();
        }

    }

    public Usuario(DadosCadatroUsuario dados){
        this.Nome = dados.nome();
        this.endereco = new EnderecoModel(dados.Endereco());
        this.Senha = dados.Senha();
        this.dataDeNascimento = dados.DataDeNascimento();
        this.Genero = dados.Genero();

    }
}





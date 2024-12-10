package Api.ApiDoProjeto.model.cadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "cadastro")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String confirmarSenha;
    private String endereco;
    private String outroEndereco;
    private String telefone_1;
    private String telefone_2;

    public CadastroModel(String nome, String email, String senha, String confirmarSenha, String endereco,
            String outroEndereco, String telefone_1, String telefone_2) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.endereco = endereco;
        this.outroEndereco = outroEndereco;
        this.telefone_1 = telefone_1;
        this.telefone_2 = telefone_2;
    }

}

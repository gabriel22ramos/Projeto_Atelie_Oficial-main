package Api.ApiDoProjeto.model.produto;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;


@SuppressWarnings("unused")
@Table(name = "produtos")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class ProdutoModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String tamanho;

    @Enumerated(EnumType.STRING)
    private Fabricante fabricante;

    private String modelo;
    private String descricao;
    private double preco;
    
    public void atualizarInformacoes(DadosAtualizarProduto dados){
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.modelo()!= null){
            this.modelo = dados.modelo();
        }
        if(dados.descricao()!= null){
            this.descricao = dados.modelo();
        }
        if(dados.preco() != 0.0){
            this.preco = dados.preco();
        }
    }

    public ProdutoModel(DadosCadastroProduto dados){
        this.nome =dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.modelo = dados.modelo();

    }
}










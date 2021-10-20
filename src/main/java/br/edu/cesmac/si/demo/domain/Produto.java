package br.edu.cesmac.si.demo.domain;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduto")
    private Long id;
    @NotEmpty(message = "É obrigatório nos informar um nome!")
    @Column(name = "nomeProduto")
    private String nome;
    @NotEmpty(message = "É obrigatório nos informar uma descrição")
    @Column(name = "descricaoProduto")
    private String descricao;
    @NotEmpty(message = "É obrigatório nos informar o código do produto!")
    @Column(name = "codigoProduto")
    private int codigo;
    @NotEmpty(message = "É obrigatório nos informar o preço do produto!")
    @Column(name = "precoProduto")
    private int preco;

    @ManyToMany
    private Collection<Categoria> categorias;

    @ManyToMany
    private Collection<Fornecedor> fornecedores;

    @ManyToOne
    private Estoque estoque;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}

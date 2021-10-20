package br.edu.cesmac.si.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFornecedor")
    private Long id;
    @NotEmpty(message = "É obrigatório nos informar um nome!")
    @Column(name = "nomeFornecedor")
    private String nome;
    @NotEmpty(message = "É obrigatório nos informar a cidade!")
    @Column(name = "cidadeFornecedor")
    private String cidade;
    @NotEmpty(message = "É obrigatório nos informar o telefone!")
    @Column(name = "telefoneFornecedor")
    private String telefone;

    @ManyToMany(mappedBy = "fornecedores")
    private Collection<Produto> produtos;

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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

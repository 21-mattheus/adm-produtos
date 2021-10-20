package br.edu.cesmac.si.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private Long id;
    @NotEmpty(message = "É obrigatório nos informar um nome!")
    @Column(name = "nomeCategoria")
    private String nome;
    @NotEmpty(message = "É obrigatório nos informar uma descrição!")
    @Column(name = "descricaoCategoria")
    private String descricao;

    @ManyToMany(mappedBy = "categorias")
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

package br.edu.cesmac.si.demo.domain;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstoque")
    private Long id;
    @NotEmpty(message = "É obrigatório nos informar o lote!")
    @Column(name = "loteEstoque")
    private String lote;
    @NotEmpty(message = "É obrigatório nos informar a quantidade!")
    @Column(name = "quantidadeEstoque")
    private int quantidade;

    @OneToMany(mappedBy = "estoque", cascade = CascadeType.ALL)
    private List<Produto> produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

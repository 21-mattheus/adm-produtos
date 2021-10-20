package br.edu.cesmac.si.demo.resources;
import br.edu.cesmac.si.demo.domain.Produto;
import br.edu.cesmac.si.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoResources {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarTodos(){

        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> pesquisarPorId(@PathVariable("id") Long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping
    public Produto inserir(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @PutMapping
    public Produto alterar(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable("id") Long id) {
        produtoRepository.deleteById(id);
    }
}

package br.edu.cesmac.si.demo.resources;

import br.edu.cesmac.si.demo.domain.Estoque;
import br.edu.cesmac.si.demo.domain.Produto;
import br.edu.cesmac.si.demo.repository.EstoqueRepository;
import br.edu.cesmac.si.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoque")
public class EstoqueResources {

    @Autowired
    EstoqueRepository estoqueRepository;

    @GetMapping
    public List<Estoque> listarTodos(){

        return estoqueRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Estoque> pesquisarPorId(@PathVariable("id") Long id) {
        return estoqueRepository.findById(id);
    }

    @PostMapping
    public Estoque inserir(@RequestBody Estoque estoque) {

        return estoqueRepository.save(estoque);
    }

    @PutMapping
    public Estoque alterar(@RequestBody Estoque estoque) {

        return estoqueRepository.save(estoque);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable("id") Long id) {
        estoqueRepository.deleteById(id);
    }
}

package br.edu.cesmac.si.demo.resources;
import br.edu.cesmac.si.demo.domain.Fornecedor;
import br.edu.cesmac.si.demo.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorResources {

    @Autowired
    FornecedorRepository fornecedorRepository;

    @GetMapping
    public List<Fornecedor> listarTodos(){
        return fornecedorRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Fornecedor> pesquisarPorId(@PathVariable("id") Long id) {
        return fornecedorRepository.findById(id);
    }

    @PostMapping
    public Fornecedor inserir(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @PutMapping
    public Fornecedor alterar(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable("id") Long id) {
        fornecedorRepository.deleteById(id);
    }
}


package br.edu.cesmac.si.demo.resources;
import br.edu.cesmac.si.demo.domain.Categoria;
import br.edu.cesmac.si.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaResources {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listarTodos(){
        return categoriaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Categoria> pesquisarPorId(@PathVariable("id") Long id) {
        return categoriaRepository.findById(id);
    }

    @PostMapping
    public Categoria inserir(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @PutMapping
    public Categoria alterar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable("id") Long id) {
        categoriaRepository.deleteById(id);
    }
}

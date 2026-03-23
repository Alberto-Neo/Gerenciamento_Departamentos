package Gerenciamento.Departamentos.Controller;

import Gerenciamento.Departamentos.Models.DepartamentoModel;
import Gerenciamento.Departamentos.Service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;


    @GetMapping
    public List<DepartamentoModel> Listar(){
        return departamentoService.listar();
    }

    @GetMapping("/{id}")
    public DepartamentoModel Buscar(@PathVariable long id){
        return departamentoService.Buscar(id);
    }

    @PostMapping
    public DepartamentoModel Criar(@RequestBody DepartamentoModel departamentoModel){
        return departamentoService.Criar(departamentoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> Deletar (@PathVariable long id){
        departamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

package Gerenciamento.Departamentos.Service;

import Gerenciamento.Departamentos.Models.DepartamentoModel;
import Gerenciamento.Departamentos.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<DepartamentoModel> listar(){
        return departamentoRepository.findAll();
    }

    public DepartamentoModel Buscar(long id){
        return departamentoRepository.findById(id).get();
    }

    public DepartamentoModel Criar(DepartamentoModel departamentoModel){
        return departamentoRepository.save(departamentoModel);
    }

    public void deletar(long id){
        departamentoRepository.deleteById(id);
    }

}

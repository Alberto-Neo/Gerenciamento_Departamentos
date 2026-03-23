package Gerenciamento.Departamentos.Repository;

import Gerenciamento.Departamentos.Models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}

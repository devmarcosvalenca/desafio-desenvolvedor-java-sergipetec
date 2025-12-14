package desafio.backend.sergipetec.ferias.repository;

import desafio.backend.sergipetec.ferias.entity.PagamentoFerias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoFeriasRepository extends JpaRepository<PagamentoFerias, Long> {
}
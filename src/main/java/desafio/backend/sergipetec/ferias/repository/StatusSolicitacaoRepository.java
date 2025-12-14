package desafio.backend.sergipetec.ferias.repository;

import desafio.backend.sergipetec.ferias.entity.Servidor;
import desafio.backend.sergipetec.ferias.entity.StatusSolicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusSolicitacaoRepository extends JpaRepository<StatusSolicitacao, Long> {
}


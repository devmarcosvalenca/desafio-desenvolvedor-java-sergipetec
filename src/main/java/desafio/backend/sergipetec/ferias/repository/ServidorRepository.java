package desafio.backend.sergipetec.ferias.repository;

import desafio.backend.sergipetec.ferias.entity.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, Long> {
}

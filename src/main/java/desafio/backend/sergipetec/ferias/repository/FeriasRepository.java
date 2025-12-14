package desafio.backend.sergipetec.ferias.repository;

import desafio.backend.sergipetec.ferias.entity.Ferias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeriasRepository extends JpaRepository<Ferias, Long> {

    List<Ferias> findByServidorIdServidor(Long idServidor);

}




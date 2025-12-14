package desafio.backend.sergipetec.ferias.service;

import desafio.backend.sergipetec.ferias.dto.FeriasResumoDTO;
import desafio.backend.sergipetec.ferias.entity.Ferias;
import desafio.backend.sergipetec.ferias.entity.StatusSolicitacao;
import desafio.backend.sergipetec.ferias.repository.FeriasRepository;
import desafio.backend.sergipetec.ferias.repository.StatusSolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class FeriasService {
    @Autowired
    private FeriasRepository repository;

    @Autowired
    private StatusSolicitacaoRepository statusRepository;

    public Ferias inserirPeriodoFerias(Ferias obj){

        LocalDate inicio = obj.getDataInicio();
        LocalDate fim = obj.getDataFim();

        if (inicio == null || fim == null) {
            throw new RuntimeException("Data início e data fim são obrigatórias");
        }

        if (fim.isBefore(inicio)) {
            throw new RuntimeException("Data fim não pode ser anterior à data início");
        }

        Long statusId = obj.getStatusSolicitacao().getIdStatus();
        StatusSolicitacao status = statusRepository.findById(statusId)
                .orElseThrow(() -> new RuntimeException("Status não encontrado"));

        obj.setStatusSolicitacao(status);

        long dias = ChronoUnit.DAYS.between(inicio, fim) + 1;
        obj.setDiasTotal((int) dias);

        return repository.save(obj);
    }

    public List<FeriasResumoDTO> buscarPorServidor(Long idServidor) {

        return repository.findByServidorIdServidor(idServidor)
                .stream()
                .map(f -> new FeriasResumoDTO(
                        f.getDataInicio(),
                        f.getDataFim(),
                        f.getDiasTotal(),
                        f.getStatusSolicitacao().getDescricao()
                ))
                .toList();
    }



    public Ferias buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Período de férias não encontrado"));
    }


}














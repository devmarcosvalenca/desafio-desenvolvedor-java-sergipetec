package desafio.backend.sergipetec.ferias.service;

import desafio.backend.sergipetec.ferias.entity.PagamentoFerias;
import desafio.backend.sergipetec.ferias.entity.Ferias;
import desafio.backend.sergipetec.ferias.repository.PagamentoFeriasRepository;
import desafio.backend.sergipetec.ferias.repository.FeriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoFeriasService {

    @Autowired
    private PagamentoFeriasRepository repository;

    @Autowired
    private FeriasRepository feriasRepository;

    public PagamentoFerias inserirPagamento(PagamentoFerias obj){

        Long idFerias = obj.getFerias().getIdFerias();

        Ferias periodoFerias = feriasRepository.findById(idFerias)
                .orElseThrow(() -> new RuntimeException("Período de férias não encontrado"));

        obj.setFerias(periodoFerias);

        return repository.save(obj);
    }
}













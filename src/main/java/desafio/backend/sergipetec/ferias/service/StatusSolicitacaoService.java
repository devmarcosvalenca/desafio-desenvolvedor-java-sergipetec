package desafio.backend.sergipetec.ferias.service;

import desafio.backend.sergipetec.ferias.entity.Servidor;
import desafio.backend.sergipetec.ferias.entity.StatusSolicitacao;
import desafio.backend.sergipetec.ferias.repository.ServidorRepository;
import desafio.backend.sergipetec.ferias.repository.StatusSolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusSolicitacaoService {
    @Autowired
    private StatusSolicitacaoRepository repository;

    public StatusSolicitacao inserirStatus(StatusSolicitacao obj){
        return repository.save(obj);
    }
}


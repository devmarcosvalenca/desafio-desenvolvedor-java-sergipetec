package desafio.backend.sergipetec.ferias.controller;

import desafio.backend.sergipetec.ferias.entity.StatusSolicitacao;
import desafio.backend.sergipetec.ferias.service.FeriasService;
import desafio.backend.sergipetec.ferias.service.StatusSolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/status-solicitacao")
public class StatusSolicitacaoController {
    @Autowired
    private StatusSolicitacaoService service;

    @Autowired
    private FeriasService feriasService;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<StatusSolicitacao> inserirStatusSolicitacao(@RequestBody StatusSolicitacao obj) {//reponse entity é basicamente para passar a resposta, e esse RequestBody é pq o servidor vai vir no body do postman que vamos testar pelo postman
        return ResponseEntity.status(HttpStatus.CREATED).body(service.inserirStatus(obj));
    }

}

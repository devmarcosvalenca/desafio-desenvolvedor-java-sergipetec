package desafio.backend.sergipetec.ferias.controller;

import desafio.backend.sergipetec.ferias.entity.PagamentoFerias;
import desafio.backend.sergipetec.ferias.service.PagamentoFeriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos-ferias")
public class PagamentoFeriasController {

    @Autowired
    private PagamentoFeriasService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<PagamentoFerias> inserirPagamento(
            @RequestBody PagamentoFerias obj) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.inserirPagamento(obj));
    }
}

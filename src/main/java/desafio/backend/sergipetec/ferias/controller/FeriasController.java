package desafio.backend.sergipetec.ferias.controller;

import desafio.backend.sergipetec.ferias.entity.Ferias;
import desafio.backend.sergipetec.ferias.service.FeriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ferias")
public class FeriasController {
    @Autowired
    private FeriasService service;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Ferias> inserirPeriodoFerias(@RequestBody Ferias obj) {//reponse entity é basicamente para passar a resposta, e esse RequestBody é pq o servidor vai vir no body do postman que vamos testar pelo postman
        return ResponseEntity.status(HttpStatus.CREATED).body(service.inserirPeriodoFerias(obj));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ferias> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

}

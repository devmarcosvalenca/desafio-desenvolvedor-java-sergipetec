package desafio.backend.sergipetec.ferias.controller;

import desafio.backend.sergipetec.ferias.dto.FeriasResumoDTO;
import desafio.backend.sergipetec.ferias.entity.Ferias;
import desafio.backend.sergipetec.ferias.entity.Servidor;
import desafio.backend.sergipetec.ferias.service.FeriasService;
import desafio.backend.sergipetec.ferias.service.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/servidores")
public class ServidorController {
    @Autowired
    private ServidorService service;

    @Autowired
    private FeriasService feriasService;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Servidor> inserirServidor(@RequestBody Servidor obj) {//reponse entity é basicamente para passar a resposta, e esse RequestBody é pq o servidor vai vir no body do postman que vamos testar pelo postman
        return ResponseEntity.status(HttpStatus.CREATED).body(service.inserirServidor(obj));
    }

    @DeleteMapping(value = "/deletar/{idServidor}")//id ta entre chaves pois é a variavel que vai vir
    public ResponseEntity<Void> excluirServidor (@PathVariable Long idServidor){//PathVariable caminho da variavel
        service.excluirServidor(idServidor);
        return ResponseEntity.noContent().build();//pois nao vai retornar nd
    }

    @GetMapping(value = "/buscar-por-id/{idServidor}")
    public ResponseEntity<Servidor> buscarPorId(@PathVariable Long idServidor){
        return ResponseEntity.ok().body(service.buscarPorId(idServidor));
    }

    @GetMapping(value = "/buscar-todos")
    public ResponseEntity<List<Servidor>> listarServidores(){
        return ResponseEntity.ok().body(service.listarServidores());
    }
//poderia usar @PatchMapping que serve para alterar apenas um valor
    @PutMapping(value = "/atualizar/{idServidor}")
    public  ResponseEntity<Servidor> atualizarDadosServidor(@PathVariable Long idServidor, @RequestBody Servidor obj){//@RequestBody Servidor obj é o servidor que esta vindo atualizado
        obj.setIdServidor(idServidor);
        return ResponseEntity.ok().body(service.atualizarDadosServidor(obj));
    }

    @GetMapping("/{idServidor}/ferias")
    public ResponseEntity<List<FeriasResumoDTO>> buscarFeriasDoServidor(
            @PathVariable Long idServidor) {

        return ResponseEntity.ok(
                feriasService.buscarPorServidor(idServidor)
        );
    }



}

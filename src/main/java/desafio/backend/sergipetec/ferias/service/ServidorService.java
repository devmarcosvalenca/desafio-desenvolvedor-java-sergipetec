package desafio.backend.sergipetec.ferias.service;

import desafio.backend.sergipetec.ferias.entity.Servidor;
import desafio.backend.sergipetec.ferias.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServidorService {
    @Autowired
    private ServidorRepository repository;

    public Servidor inserirServidor(Servidor obj){
        return repository.save(obj);
    }

    public void excluirServidor(Long idServidor){
        repository.deleteById(idServidor);
    }

    public Servidor buscarPorId(Long idServidor){
        Optional<Servidor> obj = repository.findById(idServidor); /*esse optional é para nao dar null pointerf*/
        return obj.get(); //esses .get é pq ele está dentro de um optional
    }

    public List<Servidor> listarServidores(){
        return repository.findAll();
    }

    public Servidor atualizarDadosServidor(Servidor obj){
        Optional<Servidor> novoObj = repository.findById(obj.getIdServidor());
        atualizarServidor (novoObj, obj);
        return repository.save(novoObj.get());
    }

    private void atualizarServidor (Optional<Servidor> novoObj, Servidor obj){
        novoObj.get().setNome(obj.getNome());//acho q ta ao contrario
    }

}













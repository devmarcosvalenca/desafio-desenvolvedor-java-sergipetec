package desafio.backend.sergipetec.ferias.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor						/*cria os construtores com argumentos*/
@NoArgsConstructor 						/*cria os construtores sem argumentos*/
@Getter 								/*cria os getter*/
@Setter									/*cria os setter*/
@EqualsAndHashCode(of = "idFerias")
@Entity
@Table(name = "tb_ferias")
public class Ferias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFerias;

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Integer diasTotal;

    @ManyToOne
    @JoinColumn(name = "id_servidor")
    private Servidor servidor;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private StatusSolicitacao statusSolicitacao;

    @OneToOne(mappedBy = "ferias", cascade = CascadeType.ALL)
    @JsonManagedReference
    private PagamentoFerias pagamentoFerias;
}

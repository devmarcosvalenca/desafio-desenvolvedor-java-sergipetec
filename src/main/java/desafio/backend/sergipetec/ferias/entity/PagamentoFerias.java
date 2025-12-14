package desafio.backend.sergipetec.ferias.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor						/*cria os construtores com argumentos*/
@NoArgsConstructor 						/*cria os construtores sem argumentos*/
@Getter 								/*cria os getter*/
@Setter									/*cria os setter*/
@EqualsAndHashCode(of = "idPagamento")
@Entity
@Table(name = "tb_pagamento_ferias")
public class PagamentoFerias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    @OneToOne
    @JoinColumn(name = "id_ferias")
    @JsonBackReference
    private Ferias ferias;

    private BigDecimal valorBruto;
    private BigDecimal valorLiquido;
    private LocalDate dataPagamento;
}

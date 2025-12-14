package desafio.backend.sergipetec.ferias.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FeriasResumoDTO {

    //private Long idFerias;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Integer diasTotal;
    private String descricao;

}

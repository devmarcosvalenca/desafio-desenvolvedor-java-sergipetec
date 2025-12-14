package desafio.backend.sergipetec.ferias.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor						/*cria os construtores com argumentos*/
@NoArgsConstructor 						/*cria os construtores sem argumentos*/
@Getter 								/*cria os getter*/
@Setter									/*cria os setter*/
@EqualsAndHashCode(of = "idStatus")
@Entity  								/*aqui estamos falando que é uma entidade, ou seja, tem uma tabela no banco para isso!*/
@Table(name = "tb_status_solicitacao")			/*como estou dizendo que vai ser uma tabela, para a tabela não ter o nome de livro eu uso essa notação para mudar o nome dela*/
public class StatusSolicitacao implements Serializable { //Serializable
    @Id									/*estamos falando q o proximo cara que eu criar vai ser o id (no caso esse private long id)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)		/*aqui falamos que o id vai ser gerado automaticamente entre parentesis para gerar em sequencia*/
    private Long idStatus;

    private String descricao;
}
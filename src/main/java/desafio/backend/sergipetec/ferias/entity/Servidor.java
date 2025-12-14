package desafio.backend.sergipetec.ferias.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor						/*cria os construtores com argumentos*/
@NoArgsConstructor 						/*cria os construtores sem argumentos*/
@Getter 								/*cria os getter*/
@Setter									/*cria os setter*/
@EqualsAndHashCode(of = "idServidor")
@Entity  								/*aqui estamos falando que é uma entidade, ou seja, tem uma tabela no banco para isso!*/
@Table(name = "tb_servidor")			/*como estou dizendo que vai ser uma tabela, para a tabela não ter o nome de livro eu uso essa notação para mudar o nome dela*/
public class Servidor implements Serializable { //Serializable
    @Id									/*estamos falando q o proximo cara que eu criar vai ser o id (no caso esse private long id)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)		/*aqui falamos que o id vai ser gerado automaticamente entre parentesis para gerar em sequencia*/
    private Long idServidor;

    private String nome;
    private String cpf;
    private String email;
    private String matricula;
    private LocalDate dataAdmissao;

}
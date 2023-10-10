package br.com.henry.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
@Data =@Getter+@Setter 
@Getter = get
@Setter =set
*/

@Data
//entidade bd
@Entity(name="tb_users")
public class UserModel {
  //id aleatorio @id-chave primaria
  @Id
  //gerador de ids automaticos @GeneratedValue(generetor="tipo")
  @GeneratedValue(generator = "UUID")
  private UUID id;
  //atributos pelo enenty se transforma em colunas automaticamentes 
  //@GeneratedColumn = gerar nome de coluna
  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
  
}

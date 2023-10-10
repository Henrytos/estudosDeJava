//pacote ta onde está inserida
package br.com.henry.todolist;

//importando de outros pacotes package.classe
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//executa aplicação @nome = anotation
//função
@SpringBootApplication
public class TodolistApplication {

	//executa java
	public static void main(String[] args) {
		
		SpringApplication.run(TodolistApplication.class, args);
	}

}

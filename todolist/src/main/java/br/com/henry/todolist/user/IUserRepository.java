package br.com.henry.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
                                          //genereito modelo,id
public interface IUserRepository extends JpaRepository<UserModel,UUID>{
  UserModel findByUsername(String username);
  
}

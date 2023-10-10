package br.com.henry.todolist.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//controlador tipo REST
@RestController
//ROTA
@RequestMapping("/users")
public class UserController {
  @PostMapping("/")
  //vem dados do body
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
    System.out.println(userModel.userName);
    System.out.println(userModel.password);

  }

}

package br.com.henry.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;
//controlador tipo REST
@RestController
//ROTA
@RequestMapping("/users")
public class UserController {
  @Autowired
  private IUserRepository userRepository;


  @PostMapping("/")
  //vem dados do body
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());
    if (user != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario " + userModel.getUsername() + " existente");
    }
    //criptografando senha
    var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

    //alterando senha para criptografada
    userModel.setPassword(passwordHashred);

    var userCreated = userRepository.save(userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
  }
  
  @GetMapping("/")
  public ResponseEntity getUser(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());
    return ResponseEntity.status(HttpStatus.OK).body(userModel);
  }


}

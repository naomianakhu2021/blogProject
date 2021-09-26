package com.example.blogproject.controller;

import com.example.blogproject.DTO.LoginDTO;
import com.example.blogproject.services.UserService;
import com.example.blogproject.models.Blogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping( "/api/users")
 public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("/login")
  public  Blogger userLogin(@RequestBody LoginDTO loginDTO){
   return userService.getUserByEmailAndPassWord(loginDTO.getEmail(),loginDTO.getPassword());
  }
 @PostMapping("/newUser")
   public ResponseEntity<Blogger> userRegistration(@RequestBody Blogger blogger){
   Blogger newBlogger = userService.userRegistration(blogger);
   return new ResponseEntity<>(newBlogger, HttpStatus.CREATED);
 }

// @GetMapping("/login")
// public ResponseEntity<Blogger> userLogin(@RequestBody LoginDTO loginDTO){
//  Blogger userInfo = userService.getUserByEmailAndPassWord(loginDTO.getEmail(),loginDTO.getPassword());
//  return new ResponseEntity<>(userInfo, HttpStatus.ACCEPTED);
// }
}

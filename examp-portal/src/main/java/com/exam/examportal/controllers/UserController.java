package com.exam.examportal.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exam.examportal.models.User;
import com.exam.examportal.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {


    private  UserService userService;
    @PostMapping("/")
    public ResponseEntity<User> createNewUser(@RequestBody User user){

      return null;
    }


}

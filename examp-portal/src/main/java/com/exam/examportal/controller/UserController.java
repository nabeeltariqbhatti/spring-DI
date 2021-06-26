package com.exam.examportal.controller;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.examportal.models.Role;
import com.exam.examportal.models.User;
import com.exam.examportal.models.UserRole;
import com.exam.examportal.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/")
	
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception{
	  System.out.println(user);

	  System.out.println("starting code");

      Role role = new Role("NORMAL");

      Set<UserRole> userRoles = new HashSet<>();

      userRoles.add(new UserRole(user, role));
      userService.createUser(user, userRoles);
		
	  return  ResponseEntity.created(URI.create("http://localhost:8080/user/"+user.getId())).body(user);
	}
	
	
	@GetMapping("/{username}")
	public ResponseEntity<User> getByUserName(@PathVariable("username") String username){
		
		return ResponseEntity.ok().body(userService.getUserByUsername(username));
	}
	
}

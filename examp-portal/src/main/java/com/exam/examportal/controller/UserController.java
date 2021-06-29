package com.exam.examportal.controller;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	
	@DeleteMapping("/{username}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteUserByUsername(@PathVariable("username") String username) {
		userService.deleteByUsername(username);
	}
	
	@PutMapping("/{username}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void editUserByUsername(@PathVariable("username") String username, @RequestBody User user) {
		
	  User userRetrieved = 	userService.getUserByUsername(username);
	  
	  userRetrieved.setFirstName(user.getFirstName());
	  userRetrieved.setEmail(user.getEmail());
	  userRetrieved.setLastName(user.getLastName());
	  userRetrieved.setPhone(user.getPhone());
	  
	  userService.saveUser(userRetrieved);
	  
	  
	  
	}
	
}

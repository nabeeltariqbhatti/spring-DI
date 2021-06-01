package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRest;
import com.example.demo.request.UserDetail;

@RestController
@RequestMapping("users") // https://localhost:8080/users
public class UserController {

	Map<String, UserRest> users;

	@GetMapping
	public String getUsers(@RequestParam(value = "name", defaultValue = "Unknown", required = true) String name) {
		return "all the user have been returned with name " + name;
	}

	@GetMapping(path = "/{userId}", produces = { MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		if (users != null) {
			return new ResponseEntity<UserRest>(users.get(userId), HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}

	@PostMapping(consumes = { MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> craeteUser(@Valid @RequestBody UserDetail userDetail) {

		UserRest returnValue = new UserRest();

		returnValue.setFirstName(userDetail.getFirstName());
		returnValue.setLastName(userDetail.getLastName());
		returnValue.setEmail(userDetail.getEmail());
		String userId = UUID.randomUUID().toString();
		returnValue.setUserId(userId);

		if (users == null) {
			users = new HashMap<>();
			users.put(userId, returnValue);
		} else {
			users.put(userId, returnValue);
		}
		return new ResponseEntity<UserRest>(returnValue, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{userId}", consumes = { MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_ATOM_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> updateUser(@PathVariable String userId, @Valid @RequestBody UserDetail userDetail) {
		if (users.get(userId) != null) {
			users.replace(userId, users.get(userId), userRest);
			UserRest returnValue = users.get(userId);
			returnValue.setUserId(userId);

			return new ResponseEntity<UserRest>(returnValue, HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
	}

	@DeleteMapping

	public String deleteUser() {
		return "delete user was called";
	}
}

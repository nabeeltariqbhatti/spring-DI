package com.example.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.demo.exception.UserServiceException;
import com.example.demo.model.UserRest;
import com.example.demo.request.UserDetail;
import com.example.demo.request.UserPut;
import com.example.demo.userservice.UserService;

@RestController
@RequestMapping("users") // https://localhost:8080/users
public class UserController {

    Map<String, UserRest> users;

    @Autowired
    UserService userService;

    @GetMapping
    public Map<String, UserRest> getUsers(
            @RequestParam(value = "name", defaultValue = "Unknown", required = false) String name) {
        if (true)
            throw new UserServiceException("A user Service exception is thrown..");
        return users;
    }

    @GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_ATOM_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
        if (users != null) {
            return new ResponseEntity<UserRest>(users.get(userId), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }

    @PostMapping(consumes = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces = {
            MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> craeteUser(@Valid @RequestBody UserDetail userDetail) {
          System.out.println("okay");
        UserRest returnValue = userService.createUser(userDetail);

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{userId}", consumes = {MediaType.APPLICATION_ATOM_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_ATOM_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> updateUser(@PathVariable String userId, @Valid @RequestBody UserPut userPut) {
        if (users.get(userId) != null) {

            UserRest oldreturnValue = users.get(userId);
            UserRest newReturnValue = new UserRest();
            newReturnValue.setFirstName(userPut.getFirstName());
            newReturnValue.setLastName(userPut.getLastName());
            newReturnValue.setEmail(oldreturnValue.getEmail());
            newReturnValue.setUserId(oldreturnValue.getUserId());
            users.replace(userId, oldreturnValue, newReturnValue);

            return new ResponseEntity<UserRest>(users.get(newReturnValue.getUserId()), HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @DeleteMapping(path = "/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable String userId) {
        return new ResponseEntity<String>("User with Id" + userId + " has been deleted", HttpStatus.OK);
    }
}

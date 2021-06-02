package com.example.demo.userservice;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.UserRest;
import com.example.demo.request.UserDetail;

public interface UserService {

	UserRest createUser(@Valid @RequestBody UserDetail userDetail);

}

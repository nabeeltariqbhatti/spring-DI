package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserRest;
import com.example.demo.request.UserDetail;
import com.example.demo.shared.Utils;
import com.example.demo.userservice.UserService;

@Service

public class UserServiceImplementation implements UserService {
	Map<String, UserRest> users;

	Utils utils;

	UserServiceImplementation() {
	}

	UserServiceImplementation(Utils utils) {
		this.utils = utils;
	}

	@Override
	public UserRest createUser(@Valid UserDetail userDetail) {
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
		return returnValue;
	}

}

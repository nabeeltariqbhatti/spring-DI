package com.exam.examportal.service;

import java.util.Set;

import com.exam.examportal.models.User;
import com.exam.examportal.models.UserRole;

public interface UserService {

	// create user

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

}
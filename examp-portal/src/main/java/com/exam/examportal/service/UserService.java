package com.exam.examportal.service;

import java.util.Set;

import com.exam.examportal.models.User;
import com.exam.examportal.models.UserRole;

public interface UserService {

    // create user

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    
    public User getUserByUsername(String username);
  

	public void deleteByUsername(String username);

	public void saveUser(User userRetrieved);

}

package com.exam.examportal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exam.examportal.models.User;
import com.exam.examportal.repo.UserRepository;

@Service

public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user =  userRepository.findByUserName(username);
		
		if(user==null) {
			System.out.println("No user found");
			
			throw new UsernameNotFoundException("Username does not exist..!!");
			
		}
			return user;
		
	}

}

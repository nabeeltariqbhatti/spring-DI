package com.exam.examportal.service.impl;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.exam.examportal.models.User;
import com.exam.examportal.models.UserRole;
import com.exam.examportal.repo.RoleRepository;
import com.exam.examportal.repo.UserRepository;
import com.exam.examportal.service.UserService;

@Service
@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    // creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User user_local = this.userRepository.findByUserName(user.getuserName());

        if (user_local != null) {
            try {
                {
                    // deny user creation request

                    throw new Exception("User already exists..!");

                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else {
            // create user

            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());

            }
            user.getUserRoles().addAll(userRoles);
            user_local = this.userRepository.save(user);

        }
        return user_local;
    }




	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(username);
	}
    
	
    @Override
	public void deleteByUsername(String username) {
    	userRepository.deleteByUserName(username);
    }




	@Override
	public void saveUser(User userRetrieved) {
		userRepository.save(userRetrieved);
		
	}

    

}

package com.exam.examportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.examportal.models.Role;
import com.exam.examportal.models.User;
import com.exam.examportal.models.UserRole;
import com.exam.examportal.service.UserService;

@SpringBootApplication
public class ExampPortalApplication implements CommandLineRunner {
    @Autowired
    private UserService userSerivce;

    public static void main(String[] args) {
        SpringApplication.run(ExampPortalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("starting code");
//        User user = new User("firstname", "lastname", "email", "password", "username", "profile", "admin");
//      Role role = new Role("admin");
//
// Set<UserRole> userRoles = new HashSet<>();
//
//   userRoles.add(new UserRole(user, role));
//   this.userSerivce.createUser(user, userRoles);

    }

}

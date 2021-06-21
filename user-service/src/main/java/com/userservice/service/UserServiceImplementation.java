package com.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.entity.copy.User;

@Service
public class UserServiceImplementation implements UserService {

    // fake userList

    List<User> users = List.of(new User(13L, "Nabeel Bhatti", "12345678"), new User(14L, "Ahsen Rajput", "12345678"),
            new User(11L, "Husnain Bhatti", "12345678"), new User(12L, "Raja Irslan Bhatti", "12345678")

    );

    @Override

    public User getUser(Long id) {
        return users.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}

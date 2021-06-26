package com.exam.examportal.repo;

import org.springframework.data.repository.CrudRepository;

import com.exam.examportal.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUserName(String username);
    public void deleteByUserName(String username);

}

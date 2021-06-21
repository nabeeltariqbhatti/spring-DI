package com.exam.examportal.repo;

import org.springframework.data.repository.CrudRepository;

import com.exam.examportal.models.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {

}

package com.nabeelbhatti.springbootsimplewebapp.repository;



import org.springframework.data.repository.CrudRepository;

import com.nabeelbhatti.springbootsimplewebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}

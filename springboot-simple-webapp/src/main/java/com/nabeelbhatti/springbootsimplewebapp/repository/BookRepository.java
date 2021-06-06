package com.nabeelbhatti.springbootsimplewebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.nabeelbhatti.springbootsimplewebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}

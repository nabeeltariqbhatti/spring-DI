package com.nabeelbhatti.springbootsimplewebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.nabeelbhatti.springbootsimplewebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	
	

}

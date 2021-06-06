package com.nabeelbhatti.springbootsimplewebapp.bootstrap;



import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nabeelbhatti.springbootsimplewebapp.model.Author;
import com.nabeelbhatti.springbootsimplewebapp.model.Book;
import com.nabeelbhatti.springbootsimplewebapp.model.Publisher;
import com.nabeelbhatti.springbootsimplewebapp.repository.AuthorRepository;
import com.nabeelbhatti.springbootsimplewebapp.repository.BookRepository;
import com.nabeelbhatti.springbootsimplewebapp.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository ;
	private final PublisherRepository publisherRepository;
	
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository=publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Publisher publisher = new Publisher("NY Pubs","Chsjh", "Old Auck Society", "NY", "23445");
		
		
		
		Author eric = new Author("Eric","PinkMan");
		Book book = new Book("Mudbound", "123456");
		eric.getBooks().add(book);
		book.getAuthors().add(eric);
		book.setPublisher(publisher);
		authorRepository.save(eric);
		bookRepository.save(book);
		
		Author tailor = new Author("Tailor ","Oatwell");
		Book laravel = new Book("Laravel", "345678");
		tailor.getBooks().add(laravel);
		laravel.getAuthors().add(tailor);
		laravel.setPublisher(publisher);
		
		authorRepository.save(tailor);
		bookRepository.save(laravel);
		
        publisher.getBooks().add(laravel);
        publisher.getBooks().add(book); 
		publisherRepository.save(publisher);
		System.out.println("Bootstraped");
		System.out.println(bookRepository.count() + "publishers" + publisherRepository.count());
	}

}

package com.test.sample.Repository;

import org.springframework.data.repository.CrudRepository;

import com.test.sample.Models.Book;

public interface BookRepository extends CrudRepository<Book,Long>{
	
}

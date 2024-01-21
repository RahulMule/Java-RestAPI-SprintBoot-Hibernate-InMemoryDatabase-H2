package com.test.sample.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sample.Models.Book;
import com.test.sample.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookrepository;
	
	public List<Book> GetAllBooks(){
		return (List<Book>) bookrepository.findAll();
		}
	
	public Book AddBook(Book book) {
		return bookrepository.save(book);
	}
	public Book getBookbyId(long id) {
		return bookrepository.findById(id).orElse(null);
	}
	public void deleteBookbyId(Long id) {
		bookrepository.deleteById(id);
	}
	

}

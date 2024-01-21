package com.test.sample.Models.Controller;
import com.test.sample.Services.*;
import com.test.sample.Models.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/book")
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookservice.GetAllBooks();
	}
	
	@PostMapping
	public Book AddBook(@RequestBody Book book) {
		 return bookservice.AddBook(book);
		 
	}
	@GetMapping("/{Id}")
	public Book getBookbyId(@PathVariable Long Id) {
		return bookservice.getBookbyId(Id);
	}
	@DeleteMapping("/{Id}")
	public void DeleteBook(@PathVariable Long Id) {
		bookservice.deleteBookbyId(Id);
	}
}

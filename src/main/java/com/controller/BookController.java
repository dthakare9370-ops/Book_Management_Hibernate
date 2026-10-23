package com.controller;

import java.util.List;

import com.entity.Book;
import com.service.BookService;

public class BookController {
	BookService service = new BookService();
	
	public String insert(Book book) {
		return service.save(book);
	}
	
	public Book getBookById(int id) {
		return service.getBookById(id);
	}
	
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	public String update(Book book) {
		return service.update(book);
	}
	
	public String delete(int id) {
		return service.delete(id);
	}
}

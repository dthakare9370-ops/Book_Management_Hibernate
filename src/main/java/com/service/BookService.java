package com.service;

import java.util.List;
import com.dao.BookDao;
import com.entity.Book;
import com.exceptions.BookNotFoundException;

public class BookService {
	BookDao dao = new BookDao();
	
	public String save(Book book) {
		return dao.save(book);
	}
	
	public Book getBookById(int id) {
		Book book = dao.getBookById(id);
		if(book==null) {
			throw new BookNotFoundException("Book Is not present into the Database");
		}
		return book;
	}
	
	public List<Book> getAllBooks(){
		List<Book> allBook = dao.getAllBook();
		if(allBook.size()<1) {
			throw new BookNotFoundException("Books Not Availabel into the database");
		}
		return allBook;
	}
	
	public String update(Book book) {
		return dao.update(book);
	}
	
	public String delete(int id) {
		return dao.delete(id);
	}
}

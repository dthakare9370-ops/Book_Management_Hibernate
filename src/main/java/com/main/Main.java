package com.main;

import java.util.List;

import com.entity.Book;
import com.service.BookService;

public class Main {
	public static void main(String args[]) {
		BookService service = new BookService();
		
		Book book = new Book();
		book.setbId(2);
		book.setName("Flutter");
		book.setPrice(977.34);
		
		//Insert 
//		String msg = service.save(book);
//		System.out.println(msg);
		
		
		//Get Book By ID
//		book = service.getBookById(1);
//		System.out.println(book);
		
		
		//Get All Books
//		List<Book> books = service.getAllBooks();
//		for(Book b : books) {
//			System.out.println(b);
//		}
		
		
		//Update 
//		String msg = service.update(book);
//		System.out.println(msg);
		
		
		//Delete
		String msg = service.delete(1);
		System.out.println(msg);
		
	}
}

package com.dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.Book;

public class BookDao {
	SessionFactory sf = HibernateConfig.getSessionFactory();
	
	public String save(Book book) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.persist(book);
		tr.commit();
		session.close();
		
		return "Book Inserted Successfully !!";
	}
	
	public Book getBookById(int id) {
		Session session = sf.openSession();
		Book book = session.get(Book.class, id);
		session.close();
		return book;
	}
	
	public List<Book> getAllBook() {
		Session session = sf.openSession();
		//HQL - Hibernate Query Language 
		List<Book> books = session.createQuery("from Book").list();
		session.close();
		return books;
	}
	
	public String delete(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Book book = session.get(Book.class, id);
		
		if(book == null) {
			session.close();
			return "Plase Enter Valide ID For Deletion";
		}
		
		session.delete(book);
		tr.commit();
		session.close();
		return "Book Deleted Successfully";
		
	}
	
	public String update(Book book) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Book existbook = session.get(Book.class, book.getbId());
		if(existbook == null) {
			session.close();
			return "Book is Not Present in DB for Update";
		}
		
		existbook.setName(book.getName());
		existbook.setPrice(book.getPrice());
		
		session.update(existbook);
		tr.commit();
		session.close();
		return "Book Details Update Successfully !!";
	}
}

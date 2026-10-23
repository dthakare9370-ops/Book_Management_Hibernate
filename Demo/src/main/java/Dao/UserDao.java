package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernateCon.HibernateConfig;

import entity.User;

public class UserDao {
	
	SessionFactory sf = HibernateConfig.getSessionFactory();
	
	public void save() {
		User user= new User();
		user.setId(1);
		user.setName("Ganesh");
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		session.persist(user);
		
		tr.commit();
		
		session.close();
		System.out.println("User Save Successfully ");
		
	}
	
	public static void main(String args[]) {
		UserDao userDao = new UserDao();
		userDao.save();
		
	}
	
	
}

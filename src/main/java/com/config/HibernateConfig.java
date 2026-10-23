package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

	static Configuration cf = new Configuration();
	
	public static SessionFactory getSessionFactory() {
		
		cf.configure(); // Read the configureation file 
		return cf.buildSessionFactory();
	}
}

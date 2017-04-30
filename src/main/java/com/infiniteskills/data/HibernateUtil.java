package com.infiniteskills.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.infiniteskills.data.entities.User;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		
		try{
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");

			
			return config.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		throw new RuntimeException("There was an error building the factory");
	} 
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}

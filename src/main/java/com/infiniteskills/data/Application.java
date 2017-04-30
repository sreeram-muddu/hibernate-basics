package com.infiniteskills.data;


import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.entities.User;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreateDate(new Date());
		user.setFirstName("Sreeram");
		user.setLastName("Muddu");
		user.setEmailAddress("sreeram.muddu@gmail.com");
		user.setLastUpdatedBy("Muddu");
		user.setCreateDate(new Date());
		user.setCreatedBy("Muddu");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		
		session.close();	
		
		
		

	}

}

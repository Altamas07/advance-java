package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class StudApp {
	public static void main(String[] args) {

		System.out.println("Project started....");

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);


		Student st=new Student();
		
		st.setCity("mumabai");
		st.setId(12);
		st.setName("Altamash");
		
		System.out.println(st);
		
		// 
		
		Session session=factory.openSession();
		
		Transaction beginTransaction = session.beginTransaction();
		
		session.persist(st);
		
		beginTransaction.commit();
		factory.close();
		System.out.println(factory.isClosed());

	}
}

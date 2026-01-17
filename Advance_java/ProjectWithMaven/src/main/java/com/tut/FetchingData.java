package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {

	public static void main(String[] args) {
		
		System.out.println("project started ");
		
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		// get 
		
		//Address student=(Address)session.get(Address.class, 1);
		
		//System.out.println(student);
		
//		Student st=(Student) session.get(Student.class, 12);
//		
//		System.out.println(st);
		
		
            // load 
		//Address student=(Address)session.load(Address.class, 1);
		
		//System.out.println(student);
		
		Student st= session.byId(Student.class).load(12);
		
		System.out.println(st);
		
		session.close();
		factory.close();
		
		System.out.println("Project closed ");
	}
}

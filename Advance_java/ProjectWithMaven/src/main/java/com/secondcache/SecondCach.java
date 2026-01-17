package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondCach {

	public static void main(String[] args) {
		
		
		System.out.println("Project started...");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		Student student = session.get(Student.class, 7);
		
		System.out.println(student);
		
		System.out.println("Some work is done ");
		
		Student student2 = session.get(Student.class, 7);
		
		
		System.out.println(student2);
		session.close();
		System.out.println("--------");
		System.out.println(student2);
	}
}
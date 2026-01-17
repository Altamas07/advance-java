package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstLevelCache {
    
	public static void main(String[] args) {
	
		System.out.println("Project started...");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session openSession = sessionFactory.openSession();
		
		// here first time select query is going to be fired 
		Student student = openSession.get(Student.class, 4);
		
		System.out.println(student);
		
		System.out.println("Some work is done ");
		
		// now no select query is going to be fired just it will return the object stored in the session
		// it will work only if the session is not closed and u are getting same object ;;
		Student student2 = openSession.get(Student.class, 4);
		System.out.println(student2);
		
		openSession.close();
		
}
}

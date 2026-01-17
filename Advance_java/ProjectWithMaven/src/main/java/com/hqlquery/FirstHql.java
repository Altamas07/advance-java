package com.hqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;



public class FirstHql {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory session=cfg.buildSessionFactory();
		
		Session openSess = session.openSession();
		
		String queryString="from Student";
		
		
		
		List<Student> li=openSess.createQuery(queryString).list();
		
		for(Student s:li) {
			
			System.out.println(s.getCity());
			
		}
		
		
		openSess.close();
		session.close();
		
	}
}

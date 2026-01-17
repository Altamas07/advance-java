package com.hqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class Pagination {

	public static void main(String[] args) {
		
		System.out.println("Project started ...");
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session openSess = sessionFactory.openSession();
		
		Transaction beginTransaction = openSess.beginTransaction();
		
		Query query=openSess.createQuery("from Student"); 
		
		query.setFirstResult(0);
		query.setMaxResults(10);
		
		
		
		List<Student>list = query.list();
		
		for(Student s:list) {
			
			
			System.out.println(s.getCity()+"  :  "+s.getId()+"   :    "+"   :   "+s.getName());
		}
		
		
		beginTransaction.commit();
		openSess.close();
		sessionFactory.close();
		
	}
}

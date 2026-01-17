package com.tut;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpTest {

	public static void main(String[] args) {
		
       Employee emp=new Employee();
		
		emp.setId(12);
		emp.setName("KHAN");
		emp.setCity("Mumbai");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		
		
	Transaction beginTransaction = s.beginTransaction();
	
	  s.persist(emp);
	   beginTransaction.commit();
	
	
	sf.close();
	
	System.out.println("Closed !!!");
	}
}

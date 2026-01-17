package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Stud1test {
  
	public static void main(String[] args) {
		
		System.out.println("Project started..");
		
		Configuration cfg=new  Configuration();
		cfg.configure("hibernate.cfg.xml");
		 
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student1 st=new Student1();
		
		st.setId(12);
		st.setName("Altamash");
		st.setCity("sakinaka");
		
		Certificate certi=new Certificate();
		
		certi.setCourse("CSE");
		certi.setDuration("6 months ");
		
		st.setCerti(certi);
		
     Student1 st1=new Student1();
		
		st1.setId(14);
		st1.setName("hashim");
		st1.setCity("sakinaka ");
		
		Certificate certi1=new Certificate();
		
		certi1.setCourse("IT");
		certi1.setDuration("8 months ");
		
		st1.setCerti(certi1);
		
		Session session=factory.openSession();
		
		Transaction beginTransaction = session.beginTransaction();
		
		session.persist(st);
		session.persist(st1);
		
		beginTransaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Project closed...");
	}
}

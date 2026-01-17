package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpProDemo {

	public static void main(String[] args) {
		
		System.out.println("Project sarted....");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Employee em=new Employee();
		em.setId(20);
		em.setName("hashim");
		
		Employee em1=new Employee();
		em1.setId(111);
		em1.setName("hashim");
		
		
		
		Employee em2=new Employee();
		em2.setId(143);
		em2.setName("hashim");
		
		
		
		// project
		Project pr=new Project();
		pr.setProjectId(183);
		pr.setProjectName("java");
		
		
		Project pr1=new Project();
		pr1.setProjectId(151);
		pr1.setProjectName("spring boot");
		
		
		Project pr2=new Project();
		pr2.setProjectId(173);
		pr2.setProjectName("Exception");
		
		
		List<Project> li=new ArrayList<>();
		li.add(pr);
		li.add(pr1);
		li.add(pr2);
		
		
		
		em.setPro(li);;
		em1.setPro(li);
		em2.setPro(li);
		
		List<Employee> li1=new ArrayList<>();
		li1.add(em);
		li1.add(em1);
		li1.add(em2);
		
		
		pr.setEmp(li1);
		pr1.setEmp(li1);
		pr2.setEmp(li1);
		
		
		
		Session openSession = factory.openSession();
		
		Transaction beginTransaction = openSession.beginTransaction();
		
		
		openSession.persist(pr);
		openSession.persist(pr1);
		openSession.persist(pr2);
		
		
		
		openSession.persist(em);
		openSession.persist(em1);
		openSession.persist(em2);
		
		
		beginTransaction.commit();
		openSession.close();
		factory.close();
		
		System.out.println("Project closed ....");
		} 
	
}

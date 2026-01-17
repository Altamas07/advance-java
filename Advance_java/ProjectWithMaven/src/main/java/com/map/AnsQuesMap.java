package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class AnsQuesMap {

	public static void main(String[] args) {

		System.out.println("Project started...");

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Answer a = new Answer();

		a.setAnswerId(12);
		a.setAnswer("java is a programming language::");
				 
		Question q = new Question();

		q.setQuestionId(12);
		q.setQuestion("What is java ");
		 q.setAnswer_id(a);
		 a.setQues(q);

		 
		 Answer a1 = new Answer();

			a1.setAnswerId(11);
			a1.setAnswer("collection is api frame work::");
			

			
		Question q1 = new Question();

		q1.setQuestionId(11);
		q1.setQuestion("what is collection");
		q1.setAnswer_id(a1);
		a1.setQues(q1);
		

		Session openSession = factory.openSession();

		
		Transaction beginTransaction = openSession.beginTransaction();
		
		openSession.persist(q);
		openSession.persist(q1);
		openSession.persist(a);
		openSession.persist(a1);
		beginTransaction.commit();
		
		
		openSession.close();
		factory.close();
	}
}

package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ans1Ques1Map {

	public static void main(String[] args) {

		System.out.println("Project started ...");
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		/*
		 * Question1 ques1 = new Question1(); ques1.setQuestion_id(121);
		 * ques1.setQuestion("What is java ");
		 * 
		 * Answer1 ans = new Answer1();
		 * 
		 * ans.setAnswer1_id(11); ans.setAnswer("Java is a programming language :::");
		 * ans.setQuestion(ques1); Answer1 ans1 = new Answer1();
		 * 
		 * ans1.setAnswer1_id(112);
		 * ans1.setAnswer("Java has different frame works  :::");
		 * ans1.setQuestion(ques1); Answer1 ans2 = new Answer1();
		 * 
		 * ans2.setAnswer1_id(131);
		 * ans2.setAnswer("Java is a platform independent :::");
		 * ans2.setQuestion(ques1);
		 * 
		 * List<Answer1> list=new ArrayList<Answer1>(); list.add(ans); list.add(ans1);
		 * list.add(ans2);
		 * 
		 * 
		 * 
		 * ques1.setAnswer1(list);
		 */
		
		Transaction tr=session.beginTransaction();
		
		/*
		 * session.persist(ques1); session.persist(ans); session.persist(ans1);
		 * session.persist(ans2); tr.commit();
		 */
		
		
		// fetching of many to one eager by default
		
		/*
		 * Answer1 ans=session.get(Answer1.class, 112);
		 * 
		 * System.out.println(ans.getAnswer()); System.out.println(ans.getAnswer1_id());
		 */
		
		// fetching of one to many lazy by default when i call explicitly getter method then it is going to be called
		
		Question1 ques=session.get(Question1.class, 121);
		
		
		System.out.println(ques.getQuestion());
		System.out.println(ques.getQuestion_id());
		System.out.println(ques.getAnswer1());
		
		
		session.close();
		factory.close();
		
		System.out.println("Project end...");
	}
}

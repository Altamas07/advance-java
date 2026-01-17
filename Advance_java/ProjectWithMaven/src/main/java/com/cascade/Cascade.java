package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer1;
import com.map.Question1;

public class Cascade {

	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session openSession = sessionFactory.openSession();
		
		
		
		Question1 q=new Question1();
		q.setQuestion("What is swing");
		
		q.setQuestion_id(1294);
		
		
		Answer1 a=new Answer1();
		a.setAnswer("Swing is development language");
		a.setAnswer1_id(2223);
		

		Answer1 a3=new Answer1();
		a3.setAnswer("Application building language ");
		a3.setAnswer1_id(2238);
		

		Answer1 a2=new Answer1();
		a2.setAnswer("desktop language ");
		a2.setAnswer1_id(2012);
		
		
		List<Answer1> list=new ArrayList<>();
		
		list.add(a2);
		list.add(a3);
		list.add(a);
		
		q.setAnswer1(list);
		
		
		
		Transaction transaction = openSession.beginTransaction();
		
		openSession.persist(q);
		
		
		
		
		
		
		
		transaction.commit();
		openSession.close();
		sessionFactory.close();
	}
}

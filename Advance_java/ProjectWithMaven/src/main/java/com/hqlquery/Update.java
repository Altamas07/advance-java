package com.hqlquery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Update {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("Project started...");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session openSession = factory.openSession();
		
		
		Query namedQuery = openSession.createQuery("update Student  set name=: a  where id=:n");
		
		namedQuery.setParameter("a", "Hashim");
		namedQuery.setParameter("n", 12);
		
		
		
		Transaction beginTransaction = openSession.beginTransaction();
		
		int executeUpdate = namedQuery.executeUpdate();
		
		System.out.println(executeUpdate);
		
		beginTransaction.commit();
		
		openSession.close();
		
		factory.close();
	}
}

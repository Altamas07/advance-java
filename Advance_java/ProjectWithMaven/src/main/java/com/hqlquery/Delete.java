package com.hqlquery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Delete {

	public static void main(String[] args) {
		
		System.out.println("Project satrted ");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		
		Query query = openSession.createQuery("delete from Student where id=:n"); 
		
		query.setParameter("n",12);
		
		int executeUpdate = query.executeUpdate();
		
		System.out.println(executeUpdate);
		
		beginTransaction.commit();
		openSession.close();
		factory.close();
		
	}
}

package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleAddres {
	public static void main(String[] args) throws IOException {

		System.out.println("Project started.....");

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Student st = new Student();

		st.setCity("mumabai");
		st.setId(12);
		st.setName("Altamash");
        
		System.out.println(st);

		Address address = new Address();
		Session session = sessionFactory.openSession();

		address.setStreet("90ft road ");
		address.setCity("Sakinaka");
		address.setIsopen(true);
		address.setX(23.0);
        address.setAddeddate(new Date());
		// setting image

		FileInputStream fis = new FileInputStream("src\\main\\java\\com\\tut\\pic.jpg");

		byte[] b = new byte[fis.available()];
		fis.read(b);

		address.setImage(b);

		Transaction beginTransaction = session.beginTransaction();

		session.persist(address);

		beginTransaction.commit();

		sessionFactory.close();

		System.out.println("Project completed");
	}
}

package com.digi.main;

import java.util.Date;

import org.hibernate.Session;

import com.digi.data.StudentDemo;
import com.digi.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate Annotation + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		StudentDemo user = new StudentDemo();

		user.setCreatedBy("system");
		user.setUsername("Hibernate");
		

		session.save(user);
		session.getTransaction().commit();
	}
}

package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
 
public class StudentDAO {
 
	public void addStudentDetails(String lastName, String firstName, String phoneNo) {
		try {
		    // 1. configuring hibernate
		    Configuration configuration = new Configuration().configure();
	 
		    // 2. create sessionfactory
		    SessionFactory sessionFactory = configuration.buildSessionFactory();
	 
		    // 3. Get Session object
		    Session session = sessionFactory.openSession();
	 
		    // 4. Starting Transaction
		    Transaction transaction = session.beginTransaction();
		    Student student = new Student();
		    student.setLastName(lastName);
		    student.setFirstName(firstName);
		    student.setPhoneNo(phoneNo);
		    session.save(student);
		    transaction.commit();
		    System.out.println("\n\n Details Added \n");
	 
		} catch (HibernateException e) {
		    System.out.println(e.getMessage());
		    System.out.println("error");
		}
 
	}
 
}

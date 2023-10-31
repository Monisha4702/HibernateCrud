package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;

public class UpdateEmployee {

	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		Employee emp= ses.get(Employee.class, 6);
		emp.setEmpname("Suraj");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("updated successfully");
		
	}

}

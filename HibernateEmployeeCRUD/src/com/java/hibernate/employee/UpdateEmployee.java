package com.java.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.java.hibernate.employee.dto.Employee;
import com.java.hibernate.employee.utility.HibernateUtil;

public class UpdateEmployee 
{
   public static void main(String[] args)
   {
	   SessionFactory sf=HibernateUtil.connect();
	   Session ses=sf.openSession();
	   ses.beginTransaction();
	   
	   Employee emp= ses.get(Employee.class, 1);
		emp.setEmpname("Kumar");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("updated successfully");
   }
}

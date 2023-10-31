package com.deeptech.hibernate.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;

public class CreateEmployee 
{
	public static void main(String[] args) 
	{
         Employee emp=new Employee();
         emp.setEmpid(1);
         emp.setEmpname("Monisha");
         emp.setDesignation("Developer");
         emp.setSalary(25000);
         
         SessionFactory sf=HibernateUtil.connection();
         Session ses=sf.openSession();
         ses.beginTransaction();
         ses.save(emp);
         ses.getTransaction().commit();
 		ses.close();
 		sf.close();
 		System.out.println("inserted successfully");
 		

	}

}

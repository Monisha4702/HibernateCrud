package com.deeptech.hibernate.work2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;

public class ReadEmployee 
{

	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		Query q=ses.createQuery("From Employee");
		List<Employee>ls=q.list();
		for(Employee emp:ls )
		{
			System.out.println(emp.getEmpname() +"\t"+ emp.getDesignation()+"\t"+emp.getSalary());
		}
		ses.getTransaction().commit();
	}

}

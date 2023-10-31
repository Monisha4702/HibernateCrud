package com.java.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.hibernate.employee.dto.Employee;
import com.java.hibernate.employee.utility.HibernateUtil;

public class CreateEmployee 
{
    public static void main(String[] args)
    {
    	Employee emp=new Employee();
    	emp.setEmpid(1);
    	emp.setEmpname("Nanje Gowda");
    	emp.setEmail("nanjegowda@gmail.com");
    	emp.setMobilenum("9972198280");
    	emp.setAge(53);
    	emp.setSalary(15000);
    	emp.setState("Karnataka");
    	
    	SessionFactory sf= HibernateUtil.connect();
    	Session ses=sf.openSession();
    	ses.beginTransaction();
    	ses.save(emp);
		System.out.println("Table Created Successfully and record inserted successfully");
		ses.close();
		sf.close();

    }
}

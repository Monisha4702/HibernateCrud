package com.deeptech.hibernate.work2.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
    public static SessionFactory sf;
    
    static
    {
    	sf=new Configuration().configure().buildSessionFactory();
    }
    
    public static SessionFactory connection()
    {
    	return sf;
    }
}

package com.sapient.gm.impinfo.client;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	public static class SessionFactoryHolder{
		private static final SessionFactory FACTORY = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory(); 
	}
	
	public static SessionFactory getSessionFactory(){
		return SessionFactoryHolder.FACTORY;
	}

}

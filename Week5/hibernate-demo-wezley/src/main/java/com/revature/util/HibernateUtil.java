package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {

		try {

			// Create the SessionFactory using the hibernate.cfg.xml file
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml"); // not required if you kept the default config file name (Hibernate looks for it automatically)
			return config.buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}

		return sessionFactory;
		
		// Short-hand using ternary operator
		// return (sessionFactory == null) ? sessionFactory = buildSessionFactory() : sessionFactory;
	}
}

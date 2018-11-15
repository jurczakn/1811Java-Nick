package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static ConnectionFactory cf = null;
	
	private static final String filename = "src/main/resources/datasource.properties";

	private static String url;

	private static String user;

	private static String password;

	private ConnectionFactory() {
		
		
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(filename);
			prop.load(fis);
			url = prop.getProperty("url");
			user = prop.getProperty("username");
			password = prop.getProperty("password");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized static ConnectionFactory getConnectionFactory() {
		if (cf == null) {
			cf = new ConnectionFactory();
		}
		return cf;
	}

	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Unable to make connection to DataBase");
			e.printStackTrace();
		}
		return conn;
	}

}

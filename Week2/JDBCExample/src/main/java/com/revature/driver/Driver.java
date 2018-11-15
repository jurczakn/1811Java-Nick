package com.revature.driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnectionFactory;

public class Driver {
	
	//JDBC - Java DataBase Connectivity
	//JDBC is a series of Interfaces
	//We will be using PostgreSQL's implementation of JDBC
	public static void main(String[] args) {
		
		/*try {
			Class.forName(com.postgresql.Driver);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		*/
		try {
			Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
			System.out.println("Able to connect");
			String sql = "insert into flash_card (question, answer) values('How do you create a JDBC Connection?', 'Use the DriverManager')";
			sql = "update flash_card set answer = 'Ask Nick' where question = 'How do you create a JDBC Connection?'";
			Statement stmt = conn.createStatement();
			//stmt.executeUpdate(sql);
			String sqlQuery = "select * from flash_card";
			Statement queryStmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while (rs.next()){
				System.out.println("Flash Card ID: " + rs.getInt(1));
				System.out.println("Question: " + rs.getString(2));
				System.out.println("Answer: " + rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("Unable to reach DataBase");
			e.printStackTrace();
		}
		

	}

}

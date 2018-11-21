package com.revature.driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.revature.util.ConnectionFactory;

public class TransactionDriver {
	
	public static void main(String[] args) {
		
	}

	public static void myTransaction(){
		
		Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
		
		try {
			conn.setAutoCommit(false);
			String sql = "update employee set firstname = 'another name, that is way better' where lastname = 'B'";
			Statement stmt = conn.createStatement();
			Savepoint s = conn.setSavepoint("pre-update");
			int val = stmt.executeUpdate(sql);
			if (val != 1){
				System.out.println("Too many rows updated!!!");
				conn.rollback(s);
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			System.out.println("SQL statment failed");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println("rollback failed");
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

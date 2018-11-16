package com.revature.driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.util.ConnectionFactory;

public class StoredProcFuncDriver {

	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnectionFactory().createConnection();
		
		String sql = "{call new_stored_proc(?)}";
		sql = "{call change_employee(?, ?, ?)}";
		
		try {
			CallableStatement cstmt = conn.prepareCall(sql);
			//cstmt.registerOutParameter(1, java.sql.Types.BIGINT);
			cstmt.setInt(1, 9);
			cstmt.setString(2, "Timothy");
			cstmt.setString(3, "W");
			cstmt.executeUpdate();
			//System.out.println("Count: " + cstmt.getLong(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

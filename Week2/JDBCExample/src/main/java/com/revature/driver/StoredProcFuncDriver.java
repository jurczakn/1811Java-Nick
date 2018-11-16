package com.revature.driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
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
		
		
		
		String sql2 = "{call get_emps(?)}";
		
		try {
			conn.setAutoCommit(false);
			CallableStatement cstmt = conn.prepareCall(sql2);
			cstmt.setInt(1, 8);
			ResultSet rs = cstmt.executeQuery();
			rs.next();
			//System.out.println(rs.getObject(1));
			Object rs2 = rs.getObject(1);
			if (rs2 instanceof ResultSet){
				while (((ResultSet)rs2).next()){
					System.out.println("FName: " + ((ResultSet)rs2).getString(2));
					System.out.println("LName: " + ((ResultSet)rs2).getString(1));
				}
			}
			else {
				System.out.println("not a result set");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

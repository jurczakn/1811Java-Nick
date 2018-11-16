package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.FlashCard;
import com.revature.util.ConnectionFactory;

public class FlashCardDaoPreparedStmt implements FlashCardDao {

	private static Connection conn = ConnectionFactory
			.getConnectionFactory().createConnection(); 
	
	@Override
	public void createFlashCard(FlashCard fc) {

		String sql = "insert into flash_card (question, answer) values('" 
		+ fc.getQuestion() + "','" 
		+ fc.getAnswer() + "')";
		
		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Failed to add flash card to DB");
			e.printStackTrace();
		}
	}

	@Override
	public void deleteFlashCard(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFlashCard(FlashCard fc) {
		
		String sql = "update flash_card set answer = ? where question = ?";
		
		try {
			PreparedStatement preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setString(1, fc.getAnswer());
			preparedStmt.setString(2, fc.getQuestion());
			preparedStmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Failed to update flash card");
			e.printStackTrace();
		}

	}

	@Override
	public FlashCard readFlashCard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlashCard> readAllFlashCards() {
		String sql = "select * from flash_card";
		List<FlashCard> fcList = new ArrayList<>();
		try {
			ResultSet rs = conn.createStatement().executeQuery(sql);
			while(rs.next()){
				fcList.add(new FlashCard(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			System.out.println("Failed to retrieve all flash cards from DataBase");
			e.printStackTrace();
		}
		return fcList;
	}


}

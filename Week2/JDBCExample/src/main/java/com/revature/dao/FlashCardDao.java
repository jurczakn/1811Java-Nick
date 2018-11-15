package com.revature.dao;

import java.util.List;

import com.revature.pojos.FlashCard;

//DAO is used to handle all of our CRUD operations with the DB
public interface FlashCardDao {
	
	public void createFlashCard(FlashCard fc);
	
	public void deleteFlashCard(int id);
	
	public void updateFlashCard(FlashCard fc);
	
	public FlashCard readFlashCard(int id);
	
	public List<FlashCard> readAllFlashCards();

}

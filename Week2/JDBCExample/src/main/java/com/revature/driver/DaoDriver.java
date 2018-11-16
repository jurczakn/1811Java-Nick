package com.revature.driver;

import java.util.Scanner;

import com.revature.dao.FlashCardDao;
import com.revature.dao.FlashCardDaoPreparedStmt;
import com.revature.pojos.FlashCard;

public class DaoDriver {

	private static FlashCardDao fcDao = new FlashCardDaoPreparedStmt();
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		boolean cont = true;
		
		do {

			
			System.out.println("1: View flash cards");
			System.out.println("2: Create flash card");
			System.out.println("3: Update flash card");
			System.out.println("4: exit");

			String selection = sc.nextLine();

			switch (selection) {

			case "1": runView();
				break;

			case "2": runCreate();
				break;

			case "3": runUpdate();
				break;
				
			case "4": cont = false;
				break;

			default:
				System.out.println("I did not understand?");

			}

		} while (cont);

	}
	
	private static void runView(){
		fcDao.readAllFlashCards().forEach((card) -> {System.out.println(card);});
	}
	
	private static void runCreate(){
		System.out.println("Enter question: ");
		String question = sc.nextLine();
		System.out.println("Enter answer: ");
		String answer = sc.nextLine();
		
		FlashCard newCard = new FlashCard();
		newCard.setAnswer(answer);
		newCard.setQuestion(question);
		
		fcDao.createFlashCard(newCard);
	}
	
	private static void runUpdate(){
		System.out.println("Enter question: ");
		String question = sc.nextLine();
		System.out.println("Enter answer: ");
		String answer = sc.nextLine();
		
		FlashCard upCard = new FlashCard();
		upCard.setAnswer(answer);
		upCard.setQuestion(question);
		
		fcDao.updateFlashCard(upCard);
	}

}

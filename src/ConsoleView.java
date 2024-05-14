/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: A view that allows the client to view/use the application via the Console. 
******/

import java.util.Scanner; // https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

public class ConsoleView implements IView {

	// FIELDS -------------------------------------------------------------------
	// The Scanner class is used to get user input
	private Scanner userInput = new Scanner(System.in); // Creates Scanner object

	// CONSTRUCTORS -------------------------------------------------------------
	
	// METHODS ------------------------------------------------------------------
	public void displayData(String message) {
		System.out.println(message);
	}
	
	public String getData(String message) {
		System.out.println(message);
		// Create new object to store userInput
		String userMessage = userInput.nextLine();  // Used to read user input
		return userMessage;
	}

}

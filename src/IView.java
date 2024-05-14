/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App 
 * Date: April 16, 2024 
 * Notes: Interface for the View.
 ******/

// The View gets the data from the Controller and displays it to the client
public interface IView {
	
	public void displayData(String message);
	
	public String getData(String message);

}

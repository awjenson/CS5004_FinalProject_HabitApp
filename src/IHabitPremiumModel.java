/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App 
 * Date: April 16, 2024 
 * Notes: Habit model interface that contains premium fields and methods.
 ******/

public interface IHabitPremiumModel {
	
	// GETTERS ---------------------------------------------------------------
	public PriorityModel getPriority();
	
	public CategoryModel getCategory();
		
	// SETTERS ---------------------------------------------------------------
	public void setPriority(PriorityModel priority);
	
	public void setCategory(CategoryModel category);

}

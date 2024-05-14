/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App 
 * Date: April 16, 2024 
 * Notes: Habit model interface.
 ******/

public interface IHabitModel {

	// GETTERS ---------------------------------------------------------------
	public int getId();

	public String getTitle();

	public String getNote();

	public boolean getCompleted();

	// SETTERS ---------------------------------------------------------------
	public void setId(int id);

	public void setTitle(String title);

	public void setNote(String note);

	public void setCompleted(boolean completed);

}

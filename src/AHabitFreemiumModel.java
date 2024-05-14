/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: AHabitFreemiumModel is an abstract class that provides the freemium-related fields and methods. 
******/

public abstract class AHabitFreemiumModel implements IHabitModel {

	// FIELDS ---------------------------------------------------------------
	// // Common Fields among tasks, goals, habits, jobs, missions, visions
	protected int id; 
	protected String title; 
	protected String note; // ability to add a note about the task
	protected boolean completed; // Initially set to false

	// CONSTRUCTOR -----------------------------------------------------------
	// Constructor 1
	public AHabitFreemiumModel() {
		this.id = 0;
		this.title = "";
		this.note = "";
		this.completed = false;
	}

	// Constructor 2
	public AHabitFreemiumModel(int id, String title, String note, boolean completed) {
		this.id = id;
		this.title = title;
		this.note = note;
		this.completed = completed;
	}

	// METHODS ---------------------------------------------------------------
	// ITASK INTERFACE METHODS -----------------------------------------------
	// GETTERS ---------------------------------------------------------------
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public boolean getCompleted() {
		return this.completed;
	}

	@Override
	public String getNote() {
		return this.note;
	}

	// SETTERS ---------------------------------------------------------------
	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	// OTHER METHODS ---------------------------------------------------------
	@Override
	public String toString() {
		return "\n" + "Id: " + this.id + ", " + "Title: " + this.title + ", " + "Note: " + this.note + ", "
				+ "Completed: " + this.completed + ".";
	}

}

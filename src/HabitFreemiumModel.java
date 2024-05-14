/******
* Name: Andrew Jenson
* Assignment: Final Project - Habit App
* Date: April 16, 2024
* Notes: A basic, freemium habit class. HabitFreemiumModel extends AHabitFreemiumModel.
******/
public class HabitFreemiumModel extends AHabitFreemiumModel {

	// FIELDS ----------------------------------------------------------------
	
	// CONSTRUCTOR -----------------------------------------------------------
	// Constructor 1
	public HabitFreemiumModel() {
		super();
	}
	
	// Constructor 2
	public HabitFreemiumModel(int id, String title, String note, boolean completed) {
		super(id, title, note, completed);
	}
	
	// METHODS ----------------------------------------------------------------
	// GETTERS ----------------------------------------------------------------
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getTitle() {
		return this.getTitle();
	}

	@Override
	public String getNote() {
		return this.note;
	}

	@Override
	public boolean getCompleted() {
		return this.completed;
	}

	// SETTERS ----------------------------------------------------------------
	@Override
	public void setId(int id) {
		this.id = id;	
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
		
	}

	@Override
	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}

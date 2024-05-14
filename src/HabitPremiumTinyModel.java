/******
* Name: Andrew Jenson
* Assignment: Final Project - Habit App
* Date: April 16, 2024
* Notes: A premium habit class, based on the 'Tiny Habits' book. HabitPremiumTinyModel extends AHabitPremiumModel.
******/
public class HabitPremiumTinyModel extends AHabitPremiumModel {
	
	// FIELDS ----------------------------------------------------------------
	private String anchorMoment;
	private String celebration;
	
	// CONSTRUCTOR -----------------------------------------------------------
	// Constructor 1
	public HabitPremiumTinyModel() {
		// Call AHabitPremium default constructor
		super();
		this.anchorMoment = ""; 
		this.celebration = "";
	}	
	
	// Constructor 2
	public HabitPremiumTinyModel(int id, String title, String note, boolean completed, 
			PriorityModel priority, CategoryModel category, 
			String anchorMoment, String celebration) {
		// Calls AHabitPreium's constructor
		//	  Freemium fields             Premium fields
		super(id, title, note, completed, priority, category);
		this.anchorMoment = anchorMoment; 
		this.celebration = celebration;
	}
	
	// METHODS ---------------------------------------------------------------
	// GETTERS ---------------------------------------------------------------
	public String getAnchorMoment() {
		return this.anchorMoment;
	}

	public String getCelebration() {
		return this.celebration;
	}

	// SETTERS ---------------------------------------------------------------
	public void setAnchorMoment(String anchorMoment) {
		this.anchorMoment = anchorMoment;
	}

	public void setCelebration(String celebration) {
		this.celebration = celebration;
	}
	
	// OVERRIDE METHODS ------------------------------------------------------
	
	// After I...
	// I will...
	// Then, I will (celebrate)...
	// Habit specific:
	// Based on 'Tiny Habits' book
	// https://tinyhabits.com/wp-content/uploads/2020/10/tinyhabits-recipe-cards.pdf
	@Override
	public String toString() {
		return 	"\n" +
				"Id: " + this.id + ", " +
				"Title: " + this.title + ", " + 
				"Note: " + this.note + ", " +
				"Completed: " + this.completed + ", " +
				"Priority: " + this.priority + ", " +
				"Category: " + this.category + "." +
				"\n" + " • Sentence: “" + 
				"After I " + this.anchorMoment + ", I will " + this.title + 
				". Then, I will celebrate! " + this.celebration + ".”";
	}

}

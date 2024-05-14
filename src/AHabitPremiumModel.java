/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: AHabitPremiumModel is an abstract class that provides the premium-related fields and methods. 
******/

//                    A     Premium              A     Freemium                 I     Premium
public abstract class AHabitPremiumModel extends AHabitFreemiumModel implements IHabitPremiumModel {
	
	// FIELDS -------------------------------------------------------------------
	// premium-related fields
	protected PriorityModel priority; // enum
	protected CategoryModel category; // enum
		
	// CONSTRUCTOR --------------------------------------------------------------
	// Constructor 1
	public AHabitPremiumModel() {
		// Call AHabitFreemiumModel's default constructor
		super();
		this.priority = PriorityModel.NONE;
		this.category = CategoryModel.NONE;
	}

	// Constructor 2
	public AHabitPremiumModel(int id, String title, String note, boolean completed, 
			PriorityModel priority, CategoryModel category) {
		// Call AHabitFreemiumModel's constructor with parameters
		super(id, title, note, completed);
		this.priority = priority;
		this.category = category;
	}

	// METHODS ------------------------------------------------------------------
	// INTERFACE METHODS --------------------------------------------------------
	
	@Override
	public PriorityModel getPriority() {
		return this.priority;
	}

	@Override
	public CategoryModel getCategory() {
		return this.category;
	}
	
	@Override
	public void setPriority(PriorityModel priority) {
		this.priority = priority;
	}

	@Override
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	
	// OTHER METHODS ---------------------------------------------------------
	@Override
	public String toString() {
		return "\n" + 
				"Id: " + this.id + ", " +
				"Title: " + this.title + ", " + 
				"Note: " + this.note + ", " +
				"Completed: " + this.completed + ", " +
				"Priority: " + this.priority + ", " +
				"Category: " + this.category + ".";
	}

}

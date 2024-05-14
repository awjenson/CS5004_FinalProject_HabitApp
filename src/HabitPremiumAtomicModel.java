/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App 
 * Date: April 16, 2024 
 * Notes: A premium habit class, based on the 'Atomic Habits' book.
 *        HabitPremiumAtomicModel extends AHabitPremiumModel.
 ******/

/*
 * INHERITANCE: IS-A RELATIONSHIP between the child and its parent class. The
 * child or subclass is a specialized version of the parent or superclass.
 * Inheriting from the superclass is an example of code reuse.
 * 
 * An 'Atomic Habit' is a 'Premium Habit'. 'Atomic Habit' is the child, 'Premium
 * Habit' is the parent.
 * 
 * When we create a new 'Atomic Habit' object, we DECLARE it using the parent
 * class AHabitPremiumModel and INSTANTIATE it using HabitPremiumAtomicModel.
 * 
 * DECLARATION: You define its type and its name. INSTANTIATION: The 'new'
 * keyword that creates the object.
 * 
 * Example: ------------------------------------------------------------------
 * Declaration: Instantiation: AHabitPremiumModel atomicHabit1 = new
 * HabitPremiumAtomicModel("Go to gym");
 * 
 * Source:
 * https://www.infoworld.com/article/3409071/java-challenger-7-debugging-java-inheritance.html
 */
public class HabitPremiumAtomicModel extends AHabitPremiumModel {

	// FIELDS ----------------------------------------------------------------
	private String timeAndLocation;
	private String typeOfPersonIWantToBe;

	// CONSTRUCTOR -----------------------------------------------------------
	// Constructor 1
	public HabitPremiumAtomicModel() {
		// Call AHabitPremium default constructor with 'super' keyword
		// When one class inherits from another, the superclass's constructor always
		// will be loaded first, before loading its subclass.
		super();
		this.timeAndLocation = "";
		this.typeOfPersonIWantToBe = "";
	}

	// Constructor 2
	public HabitPremiumAtomicModel(int id, String title, String note, boolean completed, PriorityModel priority,
			CategoryModel category, String timeAndLocation, String typeOfPersonIWantToBe) {
		// Calls AHabitPreium's constructor
		//    Freemium fields             Premium fields
		super(id, title, note, completed, priority, category);
		this.timeAndLocation = timeAndLocation;
		this.typeOfPersonIWantToBe = typeOfPersonIWantToBe;
	}

	// METHODS ---------------------------------------------------------------
	// GETTERS ---------------------------------------------------------------
	public String getTimeAndLocation() {
		return this.timeAndLocation;
	}

	public String getTypeOfPersonIWantToBe() {
		return this.typeOfPersonIWantToBe;
	}

	// SETTERS ---------------------------------------------------------------
	public void setTimeAndLocation(String timeAndLocation) {
		this.timeAndLocation = timeAndLocation;
	}

	public void setTypeOfPersonIWantToBe(String typeOfPersonIWantToBe) {
		this.typeOfPersonIWantToBe = typeOfPersonIWantToBe;
	}

	// OVERRIDE METHODS ------------------------------------------------------

	// Habit specific:
	// Based on 'Atomic Habits' book
	@Override
	public String toString() {
		return "\n" + "Id: " + this.id + ", " + "Title: " + this.title + ", " + "Note: " + this.note + ", "
				+ "Completed: " + this.completed + ", " + "Priority: " + this.priority + ", " + "Category: "
				+ this.category + "." + "\n" + " • Sentence: “" + "I will " + this.title + ", " + this.timeAndLocation
				+ " so that I can become " + this.typeOfPersonIWantToBe + ".”";
	}

}

/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: This class represents the single location for constants used in the program.
******/

// Make sure this class cannot be inherited from
// https://www.baeldung.com/java-constants-good-practices
// making this class final prevent it from being extended
// To prevent inheritance, use the keyword "final" when creating the class.
// https://www.thoughtco.com/how-to-prevent-inheritance-2034337
public final class ConstantModel {
	
	// All of its variables should be accessible from the outside and unchangeable
	
	// should be accessible from the outside = use "public" keyword
	// "static" keyword is used for a constant variable that is the same for every instance of a class
	// and unchangeable = use "final" keyword
	
	// Constants naming in Java: should be all UPPERCASE with words separated by underscores ("_").
	// https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
	
	// The static keyword in Java is used to share the same variable or method of a given class.
	// The static keyword is used for a constant variable (or a method) that is the same for every instance of a class.
	// Static variables and methods are allocated memory space only once during the execution of the program. 
	// This memory space is shared among all instances of the class, which makes static members useful for maintaining global state or shared functionality.
	
	public static final String GREETING  = "🤖 Hello! \nEnter anything to begin demo:";
	public static final String BEGIN_DEMO  = "🤖 Ok, diplsaying the 'Habits Demo'...";
	public static final String GOODBYE  = "\n🤖 Demo finished. \nGoodbye!";
	
	public static final String HABITS_FREEMIUM  = "\nFREEMIUM HABITS: ----------------------------------------------";
	public static final String HABITS_PREMIUM_ATOMIC  = "\nATOMIC HABITS: ------------------------------------------------";
	public static final String HABITS_PREMIUM_TINY  = "\nTINY HABITS: --------------------------------------------------";
	
	public static final String COUNT_ALL_HABITS  = "Count: ";
	public static final String REMOVE_ALL_HABITS  = "Remove all habits...";
	


	
}

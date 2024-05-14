/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: A demo database model only used to help demonstrate how this application works. 
******/

public class DemoDatabaseModel {

	// FIELDS -------------------------------------------------------------------
	// All declared as IHabitModel
	private IListADTModel<IHabitModel> dataFreemium;
	private IListADTModel<IHabitModel> dataPremiumAtomic;
	private IListADTModel<IHabitModel> dataPremiumTiny;
	
	// CONSTRUCTORS -------------------------------------------------------------
	public DemoDatabaseModel() {
		// Initialize data here
		// Initialize data to empty lists (assuming ListADTModel can be instantiated without arguments)
	    this.dataFreemium = new ListADTModel<>();
	    this.dataPremiumAtomic = new ListADTModel<>();
	    this.dataPremiumTiny = new ListADTModel<>();
		
		this.dataFreemium = createFreemiumData();
		this.dataPremiumAtomic = createPremiumAtomicData();
		this.dataPremiumTiny = createPremiumTinyData();	
	}
	
	// METHODS ------------------------------------------------------------------
	public String getFreemiumData() {
		return dataFreemium.toString();
	}
	
	public String getPremiumAtomicData() {
		return dataPremiumAtomic.toString();
	}
	
	public String getPremiumTinyData() {
		return dataPremiumTiny.toString();
	}
	
	public String countFreemiumData() {
		return String.valueOf(dataFreemium.countAllObjects());
	}
	
	public String countPremiumAtomicData() {
		return String.valueOf(dataPremiumAtomic.countAllObjects());
	}
	
	public String countPremiumTinyData() {
		return String.valueOf(dataPremiumTiny.countAllObjects());
	}
	
	private IListADTModel<IHabitModel> createFreemiumData() {
		
		// create list locally
		IListADTModel<IHabitModel> demoListFreemium = new ListADTModel<IHabitModel>();
		
		// create habits
		IHabitModel freemiumHabit1 = new HabitFreemiumModel(1, "Go to gym", "It's good for my health", false);
		IHabitModel freemiumHabit2 = new HabitFreemiumModel(2, "Read a book daily", "Plan to read 10 pages per day", false);
		IHabitModel freemiumHabit3 = new HabitFreemiumModel(3, "Eat vegetables daily", "Eat veggies at lunch and dinner", false);
		
		// add habits to list
		demoListFreemium.createObjectAtFront(freemiumHabit1);
		demoListFreemium.createObjectAtFront(freemiumHabit2);
		demoListFreemium.createObjectAtFront(freemiumHabit3);
		
		// return list locally
		return demoListFreemium;	
	}
	
	private IListADTModel<IHabitModel> createPremiumAtomicData() {
		
		// create list
		IListADTModel<IHabitModel> demoListPreemiumAtomic = new ListADTModel<IHabitModel>();
		
		// create habits
		IHabitModel preemiumHabit1 = new HabitPremiumAtomicModel(1, "Go to run club", "Helps to prepare for upcoming marathon", false, 
														PriorityModel.HIGH, CategoryModel.EXERCISE, 
														"every Monday evening", "a fast runner");
		IHabitModel preemiumHabit2 = new HabitPremiumAtomicModel(2,  "Do to yoga class", "Good for flexibility", false, 
														PriorityModel.MEDIUM, CategoryModel.EXERCISE, 
														"every Friday at sunset", "a flexibly and healthy person");
		IHabitModel preemiumHabit3 = new HabitPremiumAtomicModel(3, "Do 50 push-ups", "Good for overall health", false, 
														PriorityModel.LOW, CategoryModel.EXERCISE, 
														"every morning before breakfast", "a strong person");
		IHabitModel preemiumHabit4 = new HabitPremiumAtomicModel(4, "Review my class textbook", "Good for learning", false, 
														PriorityModel.LOW, CategoryModel.SCHOOL, 
														"every afternoon", "a good student");
		// add habits to list
		demoListPreemiumAtomic.createObjectAtFront(preemiumHabit1);
		demoListPreemiumAtomic.createObjectAtFront(preemiumHabit2);
		demoListPreemiumAtomic.createObjectAtFront(preemiumHabit3);
		demoListPreemiumAtomic.createObjectAtFront(preemiumHabit4);
			
		// return list
		return demoListPreemiumAtomic;	
	}
	
	
	private IListADTModel<IHabitModel> createPremiumTinyData() {
		
		// create list locally
		IListADTModel<IHabitModel> demoListPreemiumTiny = new ListADTModel<IHabitModel>();
		
		// create habits
		IHabitModel preemiumHabit1 = new HabitPremiumTinyModel(1, "Make healthy breakfast", "Good for my overall health", false, 
														PriorityModel.HIGH, CategoryModel.DIET, 
														"Take a shower", "Listen to my favorite podcast");
		IHabitModel preemiumHabit2 = new HabitPremiumTinyModel(2,  "Meal prep each week", "Good for flexibility", false, 
														PriorityModel.MEDIUM, CategoryModel.DIET, 
														"Return from my Sunday hike", "Watch my favorite TV show");
		IHabitModel preemiumHabit3 = new HabitPremiumTinyModel(3, "Stop eating after 9pm", "Good for overall health", false, 
														PriorityModel.LOW, CategoryModel.DIET, 
														"Return home from an evening walk", "Play relaxing music");
		IHabitModel preemiumHabit4 = new HabitPremiumTinyModel(4, "Practice Leetcode problems", "Good for my future career in CS", false, 
														PriorityModel.HIGH, CategoryModel.SCHOOL, 
														"Eat lunch", "Go for a relaxing walk");
		
		// add habits to list
		demoListPreemiumTiny.createObjectAtFront(preemiumHabit1);
		demoListPreemiumTiny.createObjectAtFront(preemiumHabit2);
		demoListPreemiumTiny.createObjectAtFront(preemiumHabit3);
		demoListPreemiumTiny.createObjectAtFront(preemiumHabit4);
			
		// return list
		return demoListPreemiumTiny;	
	}
		

}

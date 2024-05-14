/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: A controller that communicates with the application's model and view. 
******/

public class Controller implements IController {
	
	// FIELDS -------------------------------------------------------------------
	private DemoDatabaseModel model; // DemoDatabaseModel only used for demonstration purposes
	private IView view; 
	
	// CONSTRUCTORS -------------------------------------------------------------
	// DemoDatabaseModel only used for demonstration purposes
	public Controller(DemoDatabaseModel model, IView view) {
		this.model = model;
      	this.view = view;
	}
	
	// METHODS ------------------------------------------------------------------
    public void go(){
    	
    	view.getData(ConstantModel.GREETING);

    	view.displayData(ConstantModel.BEGIN_DEMO);
    	
    	view.displayData(ConstantModel.HABITS_FREEMIUM);
    	view.displayData(model.getFreemiumData().toString());
    	view.displayData(ConstantModel.COUNT_ALL_HABITS + model.countFreemiumData());
    	
    	view.displayData(ConstantModel.HABITS_PREMIUM_ATOMIC);
    	view.displayData(model.getPremiumAtomicData().toString());
    	view.displayData(ConstantModel.COUNT_ALL_HABITS + model.countPremiumAtomicData());
    	
    	view.displayData(ConstantModel.HABITS_PREMIUM_TINY);
    	view.displayData(model.getPremiumTinyData().toString());
    	view.displayData(ConstantModel.COUNT_ALL_HABITS + model.countPremiumTinyData());
    		
    	System.out.print(ConstantModel.GOODBYE);
    }

}

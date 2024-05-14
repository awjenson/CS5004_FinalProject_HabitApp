/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 15, 2024
Notes: This class represents the driver of the program. A driver class contains the main-method that runs the program.
******/

/* MVC:
 * Model: Responsible for managing the data of the application, handling calculations and business logic. 
 *        It communicates with the Controller, not the View.
 * View: Responsible for the presentation of the model in a particular format. It's what the user interacts with.
 *       It communicates with the Controller, not the Model.
 * Controller: Responds to the user input and communicates with the Model. The controller receives the input, 
 *             optionally validates it and then passes the input to the model.
 * */
public class Main {

	public static void main(String[] args) {
		
		// SETUP -------------------------------------------------
		// Model		
		DemoDatabaseModel modelDemo = new DemoDatabaseModel();
		
		// View
		IView view = new ConsoleView();
		
		// Controller
		// Creates the model, view and the controller, 
		// links the model and view to the controller
        // and then relinquishes control to the controller (by calling its go method). 
		IController controller = new Controller(modelDemo, view);
		
		// GO ----------------------------------------------------
		controller.go();			
	}

}

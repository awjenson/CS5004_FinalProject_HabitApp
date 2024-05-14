/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: A class GenericElementNode<T> that implements the IGenericListADTNode<T>, 
       represents a basic node ADT for creating a <T>.
       <T> gets replaced by whatever type you give it (e.g. Integer, String, IHabit, etc.).
******/

import java.util.function.Predicate; // import this anywhere you use Predicate

// Source: // Source: https://northeastern.instructure.com/courses/170901/pages/lesson-10-implementing-an-adt?module_item_id=9842944
// This is a non-empty node in a generic list. It contains the object data
// and the rest of the list
// You set the Node<T> and that sets the Interface INode<T>
public class GenericTElementNodeModel<T> implements IListADTGenericTNodeModel<T> {

	// FIELDS ---------------------------------------------------------------
	private T dataOfTypeT; // data you add to head node
	private IListADTGenericTNodeModel<T> rest; // link to next node / rest of nodes in the linked list

	// CONSTRUCTOR ----------------------------------------------------------
	// Constructor 1
	public GenericTElementNodeModel(T dataOfTypeT, IListADTGenericTNodeModel<T> rest) {
		this.dataOfTypeT = dataOfTypeT;
		this.rest = rest;
	}

	// METHODS --------------------------------------------------------------
	// RECURSIVE METHODS ----------------------------------------------------
	public IListADTGenericTNodeModel<T> getNodes(Predicate<T> tester) {

		// Predicate: Represents a predicate (boolean-valued) function
		// Predicate: T - the type of input to the predicate
		// This is a functional interface and can therefore be used as the assignment target for a lambda expression
		// Checks if the Predicate is true for the current node's dataOfTypeT
		// Predicate has a test(T t) method that evaluates the predicate and returns a boolean
		if (tester.test(this.dataOfTypeT)) {
			// If true:
			// 1. Create a new ElementNode with:
			// 2. The ElementNode's data (of any type), and
			// 3. A link to the NextNode
			// 4. NextNode recursively calls getNodes() method and passes the Predicate<T>
			// tester
			return new GenericTElementNodeModel<T>(this.dataOfTypeT, this.rest.getNodes(tester));
		} else {
			// If false:
			// Skip the CurrentNode, and
			// The NextNode recursively calls getNodes method and passes the Predicate<T>
			// tester
			return this.rest.getNodes(tester);
		}
	}

	@Override
	public int countAllObjects() {
		return 1 + this.rest.countAllObjects();
	}

	@Override
	public IListADTGenericTNodeModel<T> addObjectToFront(T dataOfTypeT) {
		// create a new node
		return new GenericTElementNodeModel<T>(dataOfTypeT, this);
	}

	@Override
	public IListADTGenericTNodeModel<T> addObjectToBack(T dataOfTypeT) {
		this.rest = this.rest.addObjectToBack(dataOfTypeT);
		return this;
	}

	@Override
	public IListADTGenericTNodeModel<T> addObjectAtIndex(T dataOfTypeT, int index) {
		if (index == 0) {
			return addObjectToFront(dataOfTypeT);
		} else {
			this.rest = this.rest.addObjectAtIndex(dataOfTypeT, index - 1);
			return this;
		}
	}

	@Override
	public IListADTGenericTNodeModel<T> removeObject(T dataOfTypeT) {

		// checks if the current node contains the target data
		if (this.dataOfTypeT.equals(dataOfTypeT)) {
			// If the current node does contain the target data,
			// it only returns the next node (this.rest),
			// basically REMOVING the current node from the list.
			return this.rest;
		} else {
			// If the current node does not contain the target data,
			// it recursively calls this method on the next node (this.rest)
			// to continue searching for and ROMOVING the target data
			this.rest = this.rest.removeObject(dataOfTypeT);
			// After the recursive call, return 'this',
			// meaning the current node remains in the list
			return this;
		}
	}

	@Override
	public T getObjectAtIndex(int index) throws IllegalArgumentException {
		if (index == 0)
			return this.dataOfTypeT;
		return this.rest.getObjectAtIndex(index - 1);
	}

	@Override
	public String toString() {
		String dataOfTypeTString = this.dataOfTypeT.toString();
		String rest = this.rest.toString();
		if (rest.length() > 0)
			return dataOfTypeTString + " " + rest;
		else
			return dataOfTypeTString;
	}

}

/******
* Name: Andrew Jenson
* Assignment: Final Project - Habit App
* Date: April 16, 2024
* Notes: A class EmptyNode<T> that implements the INode<T>, 
*        which represents a Linked List tail object for a list of <T>.
******/

import java.util.function.Predicate; // import this anywhere you use Predicate

// Source: https://northeastern.instructure.com/courses/170901/pages/lesson-10-implementing-an-adt?module_item_id=9842944
// This represents an empty node of the generic list implementation.
// NU Module videos teaches to create an empty node, says it will help for our methods
public class GenericTEmptyNodeModel<T> implements IListADTGenericTNodeModel<T> {

	// FIELDS ----------------------------------------------------------------

	// CONSTRUCTORS ----------------------------------------------------------

	// METHODS ---------------------------------------------------------------
	// INTERFACE METHODS -----------------------------------------------------
	public IListADTGenericTNodeModel<T> getNodes(Predicate<T> tester) {
		return new GenericTEmptyNodeModel<T>();
	}

	// OVERRIDE METHODS ------------------------------------------------------
	@Override
	public int countAllObjects() {
		return 0;
	}
	
	@Override
	public IListADTGenericTNodeModel<T> addObjectToFront(T dataOfTypeT) {
		return new GenericTElementNodeModel<T>(dataOfTypeT, this);
	}

	@Override
	public IListADTGenericTNodeModel<T> addObjectToBack(T dataOfTypeT) {
		return addObjectToBack(dataOfTypeT);
	}

	@Override
	public IListADTGenericTNodeModel<T> addObjectAtIndex(T dataOfTypeT, int index) throws IllegalArgumentException {
		if (index == 0) {
			// Add Object To FRONT
			return addObjectToFront(dataOfTypeT);
		}
		throw new IllegalArgumentException("Invalid index to add an element");
	}

	@Override
	public IListADTGenericTNodeModel<T> removeObject(T dataOfTypeT) {
		return this; // cannot remove from nothing!
	}

	@Override
	public T getObjectAtIndex(int index) throws IllegalArgumentException {
		//it should never get here if index is valid!
		throw new IllegalArgumentException("Index out of bounds: " + index);
	}
	
	@Override
	public String toString() {
		return "";
	}

}

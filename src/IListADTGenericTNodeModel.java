/******
* Name: Andrew Jenson
* Assignment: Final Project - Habit App
* Date: April 16, 2024
* Notes: Interface for creating a Linked List of <T> generic nodes.
******/

import java.util.function.Predicate; // import this anywhere you use Predicate

// T in <T> is a generic and can be any type (e.g. a class object, Integer, String, etc.
public interface IListADTGenericTNodeModel<T> {

	// METHODS -------------------------------------------------------

	/**
	 * Return the node elements from the list that satisfy the Predicate
	 * 
	 * @return the elements from this list that satisfy the Predicate
	 */
	public IListADTGenericTNodeModel<T> getNodes(Predicate<T> tester);
	
	/**
	 * Return the number of objects in this list
	 * 
	 * @return the size of this list
	 */
	public int countAllObjects();

	// I-METHODS FROM MOD 5 VIDEOS ------------------------------------

	/**
	 * Add the given object to the front of this list and return this modified list
	 * 
	 * @param b the object to be added
	 * @return the resulting list
	 */
	public IListADTGenericTNodeModel<T> addObjectToFront(T t);

	/**
	 * Add the given object to the back of this list and return this modified list
	 * 
	 * @param b the object to be added
	 * @return the resulting list
	 */
	public IListADTGenericTNodeModel<T> addObjectToBack(T t);

	/**
	 * A method that adds the given object at the given index in this list . If
	 * index is 0, it means this object should be added to the front of this list
	 * 
	 * @param index the position to be occupied by this object, starting at 0
	 * @param b     the object to be added
	 * @return the resulting list
	 * @throws IllegalArgumentException if an invalid index is passed
	 */
	public IListADTGenericTNodeModel<T> addObjectAtIndex(T t, int index) throws IllegalArgumentException;

	/**
	 * Remove the first instance of this object from the list
	 * 
	 * @param b the object to be removed
	 * @return the resulting list
	 */
	public IListADTGenericTNodeModel<T> removeObject(T t);

	/**
	 * Get the object at the specified index, with 0 meaning the first object in
	 * this list
	 * 
	 * @param index the specified index
	 * @return the object at the specified index
	 * @throws IllegalArgumentException if an invalid index is passed
	 */
	public T getObjectAtIndex(int index) throws IllegalArgumentException;

	
}


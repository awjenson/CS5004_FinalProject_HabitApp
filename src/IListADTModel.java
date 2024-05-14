/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App
 * Date: April 16, 2024
 * Notes: Interface for creating ADT lists. Methods are ADT list specific. Extends IModel.
 ******/

import java.util.function.Predicate;

/**
 * This interface represents a generic list.
 *
 * We represent the type of data that this will work with a generic parameter T (<T>). 
 * This is a placeholder for the actual data type.
 */
public interface IListADTModel<T> extends IModel<T> {
	
  // METHODS ---------------------------------------------------------------

  /**
   * Return the number count of objects currently in this list
   * @return the number count of the list
   */
  public int countAllObjects();
  
  // Return type of Interface class
  /**
   * Return nodes based on predicate (boolean value)
   * @return nodes that return a true value of the predicate
   */
  public IListADTModel<T> getNodes(Predicate<T> tester);

}
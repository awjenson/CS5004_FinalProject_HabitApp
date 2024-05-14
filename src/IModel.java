/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App 
 * Date: April 16, 2024 
 * Notes: Interface for CRUD-related methods (Create, Read, Update, Delete)
 ******/

// The Model interacts with the database
public interface IModel<T> {

	// CRUD METHODS --------------------------------------------------
	/* Create, Read, Update, Delete.
	 * The acronym CRUD refers to the major functions which are implemented by databases. 
	 * CRUD is an acronym for the four basic functions of persistent storage in computer programming.
	 * These operations are necessary for managing data 
	 * in software applications, such as databases and files.
	 * 
	 * Persistent storage refers to any data storage device that retains power after the device is powered off, 
	 * such as a hard drive. CRUD operations are widely used.
	 *
	 * Source: https://en.wikipedia.org/wiki/Create,_read,_update_and_delete
	 * */
	
	// CREATE --------------------------------------------------------
	// Create an entry/new data.

	/**
	 * Add an object to the front of this list
	 * 
	 * @param b the object to be added to the front of this list
	 */
	public void createObjectAtFront(T t);

	/**
	 * Add an object to the back of this list (so it is the last object in the list
	 * 
	 * @param b the object to be added to the back of this list
	 */
	public void createObjectAtBack(T t);

	/**
	 * Add an object to this list so that it occupies the provided index. Index
	 * begins with 0
	 * 
	 * @param index the index to be occupied by this object, beginning at 0
	 * @param b     the object to be added to the list
	 */
	public void createObjectAtIndex(T t, int index);

	// READ ----------------------------------------------------------
	// Read = getting access to the inputs or entries in the UI.
	// Read = retrieving data from a database, querying the database to fetch data

	/**
	 * Get the (index) the object in this list
	 * 
	 * @param index the index of the object to be returned
	 * @return the object at the given index
	 * @throws IllegalArgumentException if an invalid index is passed
	 */
	public T readObjectAtIndex(int index) throws IllegalArgumentException;

	// UPDATE --------------------------------------------------------
	// Update = allows you to modify existing data. That is, editing the data.
	// Update = Identify existing data and then update it

	// DELETE --------------------------------------------------------
	// Delete = delete existing data.

	/**
	 * Remove the first instance of this object from this list
	 * 
	 * @param b the object to be removed
	 */
	public void deleteObject(T t);

	/**
	 * Remove all objects from this list
	 */
	public void deleteAllObjects();

}

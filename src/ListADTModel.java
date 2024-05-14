/******
 * Name: Andrew Jenson 
 * Assignment: Final Project - Habit App 
 * Date: March 20, 2024 
 * Notes: A ListADTModel class. Implements IListADT. It was created for the Client to access and create lists.
 ******/

import java.util.function.Predicate; // import this anywhere you use Predicate

// ListADTModel implementation of a generic linked list are very similar to something that already exists in Java
// The Interface List<E> is implemented as a linked list by the LinkedList<T> class
// Using Generics, it is possible to create classes that work with different data types.
// Generics work only with Reference Types (String, Integer, etc.), not primative types (int, char)

// Use <> to specify Parameter Types in generic class creation
// The <T> in the method signature implies that the method will be dealing with generic type T. 
public class ListADTModel<T> implements IListADTModel<T> {

	// FIELDS ---------------------------------------------------------
	/* head: The ListADTModel<T> implementation simply delegates to a (map) method in the 
	 * IListGenericTNode-type objects. One minor problem is that our method is supposed to return 
	 * an IListADT<R> object, while the map in the Nodes will return a IListADTGenericTNode<R> object. 
	 * Therefore we write a private constructor that encapsulates the returning (head) node into 
	 * a ListADTModel<T> object.
	 * Source: https://northeastern.instructure.com/courses/170901/pages/lesson-12-map-abstraction?module_item_id=9842946
	 * */
	private IListADTGenericTNodeModel<T> head;
	
	// CONSTRUCTOR ----------------------------------------------------
	// Constructor 1
	public ListADTModel() {
		head = getNewListADTWithOnlyEmptyNode();
	} 
	
	// Constructor 2
	// a private constructor that is used internally (see map)
	private ListADTModel(IListADTGenericTNodeModel<T> head) {
		this.head = head;
	}
	
	// METHODS ---------------------------------------------------------
	// HELPER METHODS --------------------------------------------------
	private IListADTGenericTNodeModel<T> getNewListADTWithOnlyEmptyNode() {
		return new GenericTEmptyNodeModel<T>();
	}
	
	// IListADTModel<T> METHODS ----------------------------------------
	// Returns client accessible list of class ListADTModel<T> 
	// (which implements IListADT<T>)
	public ListADTModel<T>  getNodes(Predicate<T> tester) {
		return new ListADTModel<T>(this.head.getNodes(tester));
	}
	
	@Override
	public int countAllObjects() {
		return head.countAllObjects();
	}
	
	// IModel METHODS ---------------------------------------------------
	// CRUD methods
	@Override
	public void createObjectAtFront(T t) {
		head = head.addObjectToFront(t);
	}

	@Override
	public void createObjectAtBack(T t) {
		head = head.addObjectToBack(t);
	}

	@Override
	public void createObjectAtIndex(T t, int index) {
		head = head.addObjectAtIndex(t, index);
	}
	
	@Override
	public T readObjectAtIndex(int index) throws IllegalArgumentException {
		if ((index >= 0) && (index < countAllObjects())) {
			return head.getObjectAtIndex(index);
		} else
			throw new IllegalArgumentException("Invalid index");
	}

	@Override
	public void deleteObject(T t) {
		head = head.removeObject(t);
	}
	
	@Override
	public void deleteAllObjects() {
		head = getNewListADTWithOnlyEmptyNode();
	}
	
	@Override
	public String toString() {
		return head.toString();
	}
		

}

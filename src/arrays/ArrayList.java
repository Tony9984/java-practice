package arrays;

/**
 * Implementation for the main methods of the Java ArrayList class
 * @author tonyou
 *
 * @param <E>
 */

public class ArrayList<E> {
	
	private Object elements[];
	private int size = 0;
	private static final int INITIAL_CAPACITY = 10;
	
	/**
	 * Constructor, initializes initial array to capacity 10
	 */
	
	public ArrayList() {
		elements = new Object[INITIAL_CAPACITY];
	}
	
	/**
	 * Checks if the list is empty
	 * 
	 * @return true if the list is empty
	 */
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Get the size of the list
	 *  
	 * @return number of elements in the list
	 */
	
	public int size() {
		return size;
	}
	
	/**
	 * Add an element to the end of the list
	 * 
	 * @param e element to be added
	 * @return true
	 */
	
	public boolean add(E e) {
		if (size < elements.length) {
			elements[size++] = e;
			return true;
		} else {
			int new_capacity = elements.length * 2;
			Object new_list[] = new Object[new_capacity];
			for (int i = 0; i < elements.length; i++) {
				new_list[i] = elements[i];
			}
			elements = new_list;
			elements[size++] = e;
			return true;
		}
	}
	
	/**
	 * Remove an element at a specified index from the list
	 * 
	 * @param index the index of the element to be removed
	 * @return the removed element
	 */
	
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		E removedElement = (E) elements[index];
		while (index < this.size()) {
			elements[index] = elements[++index];
		}
		elements[--size] = null;
		return removedElement;
	}
	
	/**
	 * Get an element at a specified index in the list
	 * 
	 * @param index the index of the element
	 * @return the element at the index
	 */
	
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return (E) elements[index];
	}
	
	/**
	 * Replace an element at a specified index in the list
	 * 
	 * @param index the index of the element to be replaced
	 * @param element the new element
	 * @return the element that was replaced
	 */
	
	public E set(int index, E element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		E previousElement = (E) elements[index];
		elements[index] = element;
		return previousElement;
	}
	
}

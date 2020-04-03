package linkedLists;

public class Node<E> {
	public E element;
	public Node<E> next;
	public Node<E> prev;
	
	public Node(E element) {
		this.element = element;
	}
}

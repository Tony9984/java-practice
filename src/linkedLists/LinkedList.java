package linkedLists;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	
	public void add(int index, E e) {
		Node<E> node = new Node(e);
		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {
			int i = 0;
			Node pointer = head;
			while (i != index) {
				pointer = head.next;
			}
		}
	}
	
	public void addFirst(E e) {
		Node<E> node = new Node(e);
		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
			size++;
		}
	}
	
	public void addLast(E e) {
		Node<E> node = new Node(e);
		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	public E removeFirst() {
		if (head == null) {
			throw new NullPointerException();
		}
		if (head.next == null) {
			E removedValue = head.element;
			head = null;
			tail = null;
			size--;
			return removedValue;
		} else {
			E removedValue = head.element;
			head.next.prev = null;
			head = head.next;
			size--;
			return removedValue;
		}
	}
	
	public E removeLast() {
		if (head == null) {
			throw new NullPointerException();
		}
		if (head.next == null) {
			E removedValue = head.element;
			head = null;
			tail = null;
			size--;
			return removedValue;
		} else {
			E removedValue = tail.element;
			tail.prev.next = null;
			tail = tail.prev;
			size--;
			return removedValue;
		}
	}
	
	public E getFirst() {
		if (head == null) {
			throw new NullPointerException();
		}
		return head.element;
	}
	
	public E getLast() {
		if (head == null) {
			throw new NullPointerException();
		}
		return tail.element;
	}
}

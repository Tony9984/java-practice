package linkedLists;

public class SinglyLinkedList {
	private SNode head;
	
	public void addFirst(int element) {
		SNode node = new SNode(element);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public void addLast(int element) {
		SNode node = new SNode(element);
		if (head == null) {
			head = node;
		} else {
			SNode pointer = head;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = node;
		}
	}
	
	public int removeFirst() {
		if (head == null) {
			return -1;
		} else {
			int removedValue = head.element;
			head = head.next;
			return removedValue;
		}
	}
	
	public int removeLast() {
		if (head == null) {
			return -1;
		} else {
			if (head.next == null) {
				int removedValue = head.element;
				head = null;
				return removedValue;
			} else {
				SNode pointer = head;
				while (pointer.next.next != null) {
					pointer = pointer.next;
				}
				int removedValue = pointer.next.element;
				pointer.next = null;
				return removedValue;
			}	
		}
	}
}

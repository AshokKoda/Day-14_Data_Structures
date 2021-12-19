package com.bridgelabz.StackQeue;

public class LinkedList<K> {

	public Node<K> head;
	public Node<K> tail;
	
	/*
	 * Search Node
	 */
	public boolean search(K data) {
		Node<K> temp = head;
		boolean isPresent = false;
		if (head == null) {
			System.out.println("Linked List is empty");
			return false;
		} else {
			while (temp != null) {
				if (temp.data == data) {
					isPresent = true;
					break;
				} else {
					temp = temp.next;
				}
			}
		}
		return isPresent;
	}
	
	/*
	 * Add Node
	 */
	public void addNode(K data) {
		Node<K> addNode = new Node<K>(data);
		if (head == null) {
			head = addNode;
		} else {
			Node<K> temp = head;
			head = addNode;
			addNode.next = temp;
		}
	}
	
	/*
	 * Append Node
	 */
	public void appendNode(K data) {
		Node<K> appendNode = new Node<K>(data);
		if (head == null) {
			head = appendNode;
			tail = appendNode;
		} else {
			tail.next = appendNode;
			tail = tail.next;
		}
	}
	
	/*
	 * Insert node
	 */
	public void insertNode(K data) {
		Node<K> node = new Node<K>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}
	
	/*
	 * Insert between
	 */
	public void insertBetween(K x, K y, K z) {
		Node<K> newNode = new Node<K>(z);
		Node<K> temp = head;
		while (temp.next != null) {
			if ((temp.data == x && temp.next.data == y) || (temp.data == y && temp.next.data == x)) {
				Node<K> Znode = temp.next;
				temp.next = newNode;
				temp.next.next = Znode;
				break;
			}
			temp = temp.next;
		}
	}
	
	/*
	 * Delete 1st node
	 */
	public void pop() {
		Node<K> temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = temp.next;
		}
	}
	
	/*
	 * Insert After node
	 */
	public void insertAfter(K insertAfter, K insertData) {
		Node<K> temp = head;
		Node<K> insertNode = new Node<K>(insertData);
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			while (temp != null) {
				if (temp.data == insertAfter) {
					Node<K> node = temp.next;
					temp.next = insertNode;
					insertNode.next = node;
					temp = node;
				} else {
					temp = temp.next;
				}
			}
		}
	}
	
	/*
	 * Delete node
	 */
	public void deleteNode(K key) {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node<K> temp = head;
			if (head.data == key) {
				head = head.next;
			}
			while (temp != null && temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
	}
	
	/*
	 * Peek node
	 */
	public void peek() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println(head.data);
		}
	}
	
	/*
	 * Pop Last
	 */
	public void popLast() {
		Node<K> temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
	}
	
	/*
	 * Print
	 */
	public void printList() {
		Node<K> temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

}

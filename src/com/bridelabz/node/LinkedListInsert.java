package com.bridelabz.node;

public class LinkedListInsert {

	Node head;
	Node tail;
	
	/*
	 * Create list
	 */
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}
	
	/*
	 * Add Node to linked list
	 */
	public void addAfter(int insertAfter, int insertData) {
		Node temp = head;
		Node insertNode = new Node(insertData);
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			while (temp != null) {
				if (temp.data == insertAfter) {
					Node node = temp.next;
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
	 * Print list
	 */
	public void printList() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			while (temp != null) {
				System.out.println(temp.data + "->");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		
		LinkedListInsert list = new LinkedListInsert();
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		list.printList();
		System.out.println("After insertion : ");
		list.addAfter(30,40);
		list.printList();

	}

}

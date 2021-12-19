package com.bridelabz.node;

public class LinkedListProblem {

	Node head;
	Node tail;
	
	/*
	 * Create Node
	 */
	public void create(int data) {
		Node nextNode = new Node(data);
		if (head == null) {
			head = nextNode;
			tail = nextNode;
		} else {
			tail.next = nextNode;
			tail = tail.next;
		}
	}
	
	/*
	 * Delete node
	 */
	public void pop() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = temp.next;
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
		
		LinkedListProblem list = new LinkedListProblem();
		list.create(56);
		list.create(30);
		list.create(70);
		list.printList();
		System.out.println("After Pop remove the first element: ");
		list.pop();
		list.printList();

	}

}

package com.bridelabz.node;

public class LinkedListForDeletelastNode {

	Node head;
	Node tail;

	/*
	 * Create Node
	 */
	public void createNode(int data) {
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
	 * Delete last node
	 */
	public void popLastNode() {
		Node temp = head;
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

		LinkedListForDeletelastNode list = new LinkedListForDeletelastNode();
		list.createNode(56);
		list.createNode(30);
		list.createNode(70);
		list.printList();
		System.out.println("After Pop remove the last element: ");
		list.popLastNode();
		list.printList();

	}

}

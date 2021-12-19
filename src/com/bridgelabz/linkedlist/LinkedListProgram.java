package com.bridgelabz.linkedlist;


class Node {
	int data;
	Node addressOfNextNode;
	Node next;
};

class LinkedList{
	Node head;
	Node tail;

	LinkedList() {
		head = null;
	}
	
	/*
	 * Add Node
	 */
	public void addNode(int newVal) {
		Node newNode = new Node();
		newNode.data = newVal;
		newNode.addressOfNextNode = null;
		if (head == null) {
			head = newNode;
		} else {
			Node temp = new Node();
			temp = head;
			while (temp.addressOfNextNode != null)
				temp = temp.addressOfNextNode;
			temp.addressOfNextNode = newNode;
		}
	}
	
	/*
	 * Append Node
	 */
	public void appendNode(int newVal) {
		Node nextNode = new Node();
		nextNode.data = newVal;
		if(head == null) {
			head = nextNode;
			tail = nextNode;
		}else {
			tail.next = nextNode;
            tail = tail.next;
		}
	}
	
	/*
	 * Print list
	 */
	public void PrintList() {
		Node temp = new Node();
		temp = this.head;
		if (temp != null) {
			System.out.print("Linked List have: ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.addressOfNextNode;
			}
			System.out.println();
		} else {
			System.out.println("The list is empty.");
		}
	}
}

public class LinkedListProgram {
	
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.appendNode(56);
		myList.appendNode(30);
		myList.appendNode(70);
		myList.PrintList();

	}

}

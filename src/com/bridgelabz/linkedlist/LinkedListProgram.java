package com.bridgelabz.linkedlist;


class Node {
	int data;
	Node addressOfNextNode;
};

class LinkedList{
	Node head;

	LinkedList() {
		head = null;
	}
	
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
		myList.addNode(70);
		myList.addNode(30);
		myList.addNode(56);
		myList.PrintList();

	}

}

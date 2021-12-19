package com.bridelabz.node;

public class LinkedListSearch {

	Node head;
	Node tail;
	
	/*
	 * Add node
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
	 * Search Node
	 */
	public void searchNode(int data) {
		Node temp = head;
		int index = 0;
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			while (temp != null) {
				index++;
				if (temp.data == data) {
					System.out.println("Node is present " + index + " position");
					break;
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
		
		LinkedListSearch search = new LinkedListSearch();
		search.addNode(56);
		search.addNode(30);
		search.addNode(70);
		search.printList();
		search.searchNode(70);

	}

}

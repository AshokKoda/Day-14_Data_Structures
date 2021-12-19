package com.bridelabz.node;

public class LinkedListDeleteNode {

	Node head;
	Node tail;
	int size;
	
	/*
	 * AddNode
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
	 * Delete node
	 */
	public void deleteNode(int key) {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node temp = head;
			if (head.data == key) {
				head = head.next;
				size--;
			}
			while (temp != null && temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
					size--;
				}
				temp = temp.next;
			}
		}
	}
	
	/*
	 * Node size
	 */
	public void nodeSize() {
		int size = 0;
		Node current = head;
		if (head == null) {
			System.out.println("Size is 0");
		}
		current = head;
		size = 1;
		while (current.next != null) {
			current = current.next;
			size++;
		}
		System.out.println("List size linked list is:" + size);
	}
	
	/*
	 * Search Node
	 */
	public void searchNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present at the position : " + i);
		else
			System.out.println("Element is not present");
	}
	
	/*
	 * Print List
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
		
		LinkedListDeleteNode delNode = new LinkedListDeleteNode();
		delNode.addNode(56);
		delNode.addNode(30);
		delNode.addNode(40);
		delNode.addNode(70);
		delNode.printList();
		delNode.nodeSize();
		delNode.searchNode(40);
		delNode.deleteNode(40);
		delNode.printList();
		delNode.nodeSize();

	}

}

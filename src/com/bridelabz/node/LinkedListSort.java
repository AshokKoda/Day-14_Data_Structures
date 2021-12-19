package com.bridelabz.node;

public class LinkedListSort {

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
	 * Insert between nodes
	 */
	public void insertBetweenNode(int a, int b, int c) {
		Node newNode = new Node(c);
		Node temp = head;
		while (temp.next != null) {
			if ((temp.data == a && temp.next.data == b) || (temp.data == a && temp.next.data == b)) {
				Node cnode = temp.next;
				temp.next = newNode;
				temp.next.next = cnode;
				break;
			}
			temp = temp.next;
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
	 * Sort Node
	 */
//	public void sortNode() {
//	 	   Node current = head,index =null;
//	 	   int temp;
//				if (head == null) {
//	         return;		
//	         } else {
//					while(current!=null) {
//						//node index will point to node next to current
//					index = current.next;
//					
//					while(index!=null) {
//						//if current node data is greater than index node data, swap the data between them
//						if(current.data>index.data) {
//							temp =current.data;
//							current.data=index.data;
//							index.data=temp;
//						}
//						index = index.next;
//					}
//				  current =current.next;	
//				}
//						
//			  }
//			}
	
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
		
		LinkedListSort sortNode = new LinkedListSort();
		sortNode.addNode(56);
		sortNode.addNode(30);
		sortNode.addNode(40);
		sortNode.addNode(70);
		sortNode.insertBetweenNode(56, 70, 30);
		sortNode.printList();
		

	}
}

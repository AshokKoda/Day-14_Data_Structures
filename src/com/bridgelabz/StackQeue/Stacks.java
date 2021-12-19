package com.bridgelabz.StackQeue;

public class Stacks<K> {

	LinkedList<K> linkedList;
	
	public Stacks() {
		this.linkedList = new LinkedList<>();
	}
	
	public void push(K data) {
		linkedList.addNode(data);
	}
	
	public void pop() {
		linkedList.pop();
	}
	
	public void peek() {
		linkedList.peek();
	}
	
	public static void main(String[] args) {
		
		Stacks<Integer> stack = new Stacks<>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peek();
		stack.pop();
		stack.peek();

	}

}

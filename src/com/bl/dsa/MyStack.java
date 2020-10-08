package com.bl.dsa;

public class MyStack<K> {
	private final MyLinkedList<K> myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<K>();
	}

	/* push method */
	public void push(INode<K> newNode) {
		myLinkedList.add(newNode);
	}

	/* shows and removes the last element added */
	public INode<K> pop() {
		return myLinkedList.pop();
	}

	/* peek method, shows the last element added */
	public INode<K> peek() {
		return myLinkedList.peek();
	}

	/* Utility: Prints the stack */
	public void printStack() {
		myLinkedList.print();
	}

}

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

	/* Utility: Prints the stack */
	public void printStack() {
		myLinkedList.print();
	}

}

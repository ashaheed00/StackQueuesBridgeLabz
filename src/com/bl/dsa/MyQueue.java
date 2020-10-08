package com.bl.dsa;

public class MyQueue<K> {
	private final MyLinkedList<K> myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<K>();
	}

	/* enqueue method */
	public void add(INode<K> newNode) {
		myLinkedList.append(newNode);
	}

	/* Utility: Prints the queue */
	public void printQueue() {
		myLinkedList.print();
	}
}

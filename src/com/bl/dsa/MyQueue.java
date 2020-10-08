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
	
	/* shows and removes the first element added */
	public INode<K> remove() {
		return myLinkedList.pop();
	}

	/* peek method, shows the first element added */
	public INode<K> peek() {
		return myLinkedList.peek();
	}

	/* Utility: Prints the queue */
	public void printQueue() {
		myLinkedList.print();
	}
}

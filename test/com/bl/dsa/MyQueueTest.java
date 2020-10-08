package com.bl.dsa;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.add(myFirstNode);
		myQueue.add(mySecondNode);
		myQueue.add(myThirdNode);
		System.out.print("Queue: ");
		myQueue.printQueue();
	}

}

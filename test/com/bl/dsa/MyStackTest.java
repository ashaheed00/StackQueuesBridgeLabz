package com.bl.dsa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNodeFirst() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack<Integer> myLinkedList = new MyStack<>();
		myLinkedList.push(myFirstNode);
		myLinkedList.push(mySecondNode);
		myLinkedList.push(myThirdNode);
		myLinkedList.printStack();
		
	}

}

package com.bl.dsa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		assertEquals(myThirdNode, myStack.peek());
		System.out.print("Stack after peek: ");
		myStack.printStack();
	}

	@Test
	public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		System.out.print("Stack before pop: ");
		myStack.printStack();
		assertEquals(myThirdNode, myStack.pop());
		System.out.print("Stack after pop: ");
		myStack.printStack();
	}

}

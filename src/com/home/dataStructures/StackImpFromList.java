package com.home.dataStructures;

public class StackImpFromList {

	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	StackImpFromList(){
		head= null;
	}
	
	public void push(int value) {
		Node extraHead = head;
		head= new Node();
		head.value = value;
		head.next = extraHead; //null // 10 null // 
		System.out.println(head.value);
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("Stack is Empty");
		}
			int value = head.value;
			head = head.next;
			return value;
	}
	
	public static void PrintList(Node Head) {
		Node tempNode = Head;
		while(tempNode != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
	}
	
	public static void main(String[] args) {
		StackImpFromList SIL = new StackImpFromList();
		//System.out.println(SIL.pop());
		SIL.push(10);
		SIL.push(20);
		SIL.push(30);
		SIL.push(40);	
		System.out.println("Popped Element is " + SIL.pop());
		PrintList(SIL.head);
	}
}

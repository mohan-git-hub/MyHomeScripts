package com.home.dataStructures;

public class StackImplementation {
	
	int size;
	int arr[];
	int top;
	
	StackImplementation(int size){
		
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
		public boolean IsEmpty() {
			return (top == -1);
		}
		
		public boolean IsFull() {
			return (top == size-1);
		}
		
		public int peek() {
			if(!this.IsEmpty()) {
				return arr[top];
			}
			else
			{
				System.out.println("Stack is Empty");
				return -1;
			}
		}
		
		public void pushElement(int Element) {
			if(!this.IsFull()) {
				top += 1;
				arr[top] = Element;
				System.out.println("Pushed Element is " + Element);
			}
			else
			{
				System.out.println("Stack is Full");
			}
		}
		
		public int popElement() {
			if(!this.IsEmpty()) {
				int returnedTop = top;
				top--;
				System.out.println("Popped Element is " + arr[returnedTop]);
				return arr[returnedTop];
			}
			else
			{
				System.out.println("Stack is Empty");
				return -1;
			}
		}
		
		public static void main(String[] args) {
			StackImplementation SIP = new StackImplementation(10);
			SIP.popElement();
			SIP.pushElement(10);
			SIP.pushElement(20);
			SIP.pushElement(30);
			SIP.pushElement(40);
			System.out.println("--------------");
			SIP.popElement();
			SIP.popElement();
			System.out.println("Peek Element is " + SIP.peek());
			System.out.println(SIP.IsEmpty());
			System.out.println(SIP.IsFull());
		}
		
	}



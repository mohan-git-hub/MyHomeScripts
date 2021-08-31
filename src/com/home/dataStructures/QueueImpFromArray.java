package com.home.dataStructures;

public class QueueImpFromArray {
	
	int size;
	int[] arr;
	int first;
	int last;
	
	QueueImpFromArray(int size){
		this.size = size;
		this.arr = new int[size];
		this.first = -1;
	}
	
	public boolean IsEmpty() {
		return (first == -1);
	}
	public boolean IsFull() {
		return (first == size-1);
	}
	public void add(int Element) {
		if(!IsFull()) {
			first += 1;
			arr[first] = Element;
			System.out.println("Added Element is " + arr[first]);
		}
		else
		{
			System.out.println("Queue is Full");
		}
	}
	
	public int remove() {
		if(!IsEmpty()) {
			int removedElement = arr[0];
			for(int i=0;i<size-2;i++){
				arr[i] = arr[i+1];
			}
			first--;
			return removedElement;
		}
		else
		{
			System.out.println("Queue is Empty - Element not Found");
			return -1;
		}
	}
	
	public int poll() {
		if(!IsEmpty()) {
			int removedElement = arr[0];
			for(int i=0;i<=size-2;i++){
				arr[i] = arr[i+1];
			}
			first--;
			return removedElement;
		}
		else
		{
			System.out.println("Queue is Empty - Null Pointer Exception");
			return -1;
		}
	}
	
	public int peek() {
		if(!IsEmpty()) {
			return arr[0];
		}
		else
		{
			System.out.println("Queue is Empty - Null");
		}
		return -1;
	}
	
	public int element() {
		if(!IsEmpty()) {
			return arr[0];
		}
		else
		{
			System.out.println("Queue is Empty - No such Element");
		}
		return -1;
	}
	
	public void size() {
		System.out.println("No. of Elements in the Queue is " + (first+1));
	}
	
	public static void main(String[] args) {
		QueueImpFromArray QIA = new QueueImpFromArray(5);
		QIA.add(15);
		QIA.add(25);
		QIA.add(30);
		QIA.add(35);
		QIA.add(40);
		System.out.println("Removed Element is " + QIA.remove());
		System.out.println("Polled Element is " + QIA.poll());
		QIA.add(40);
		System.out.println("Current Head Element is " + QIA.element());
		System.out.println("Peek Head Element is " + QIA.peek());
		
		QIA.size();
	}

}

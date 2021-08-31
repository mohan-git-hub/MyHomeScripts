package com.home.preparations;

import java.util.Arrays;

public class BinarySearch {

	
	public static void main(String[] args) {
		int[] arr = {2,8,3,1,7,6,9};
		int n = arr.length;
		int find = 2;
		int result = binarySearch(arr,0,n-1,find);
		if(result == -1)
			System.out.println("Number Not Found");
		else
			System.out.println("Element found at poistion " + result);
		
	}
	
	public static int binarySearch(int arr[], int low, int high, int find) {
		while(low<=high) {
			int mid = low + (high-low)/2;
			System.out.println("Mid is " + mid);
			if(arr[mid]==find)
			return mid;
			
			if(arr[mid]<find) {
			low = mid+1;
			}
			else {
			high = mid-1;
			}
		}
		return -1;
	}
}

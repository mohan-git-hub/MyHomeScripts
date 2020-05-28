package com.mypractice;

public class ExampleTest1 {
	int size;
	static String Product;
	char Type;
	
	public void findproduct(int size, String Product) {
		this.size=size;
		ExampleTest1.Product=Product;
		System.out.println("Find product with 2 Arguments"+size+Product);
		
	}
	public void findproduct(int size, String Product,char Type) {
		this.size=size;
		ExampleTest1.Product=Product;
		this.Type =Type;
		System.out.println("Find product with 3 Arguments"+size+Product+Type);
	}
	public void getproduct(int size1, int size2, String Product1, String Product2, char Type1) {
		ExampleTest1 ET = new ExampleTest1();
		findproduct(size1, Product1);
		findproduct(size2, Product2, Type1);
		System.out.println("The Product is " + Product + " with size " + size + " GB and is of " + Type +  " Type" );
		}
	
	public static void main(String [] args) {
		new ExampleTest1().getproduct(4,8,"Apple","Samsumg",'C');
		
		
	}}

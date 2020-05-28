package com.mypractice;

public class ArrayTest{
	int [] numarr= {5,4,9,2,5,9,4,3,7};
	public void examarr1() 
	{
		System.out.println("The length of array "+numarr.length);
		
		for (int i=0;i<numarr.length-1;i++) 
		{
			int sum=1;
			for (int j=i+1;j<numarr.length;j++)
			{
				if(numarr[i]==numarr[j]) {
				//System.out.println("The Repeated number" + numarr[i]);
				sum+=1;
				//System.out.println("The number " + sum +" the value of " + numarr[i]);
				}
			
			}
			if(sum==1) {
				System.out.println("The unique no is" + numarr[i]);
				
			}}}
	
	public  void examarr2(int [] numarr3) 
	{
		System.out.print("Missing numbers are ");
		for (int i=1;i<=numarr3.length;i++) {
			int noof=numarr3[i-1];
			if(i!=noof) {
				
				System.out.print(i + " " );
				
			}
}}
	
public static void main(String [] args) {
	ArrayTest AT= new ArrayTest();
	int [] missarr= {1,2,2,4,5,5,7,8,8,10};
	AT.examarr1();
	AT.examarr2(missarr);
	
	
}
}


//if (numarr3[i]==numarr3[j])
//{
//noofoc+=1;
//System.out.println("The value of occurance" + noofoc);
//}
//else if(noofoc==1)
//{
	//System.out.println("The number "+ numarr3[i]);
//}
//else {
//System.out.println("the Missing value" +);
//}
//}
//}//}

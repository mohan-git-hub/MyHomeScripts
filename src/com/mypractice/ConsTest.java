package com.mypractice;

public class ConsTest {
	
	public void looptest1(int a,int b)
	{
		int x;
		int y;
		for(x=0;x<=a;x++) {
			for(y=0;y<=b;y++) {
				if(y%9==0)
				{
				System.out.println(y + " the given value is divisable by 9 " );
			
				}
				//else {
					//System.out.println("the given value is not divisable by 9"+ y);
					//}
			}
			
			switch(x)
			{
			case 0: 
				System.out.println("First Loop Ends");
				break;
			case 1: 
				System.out.println("Second Loop Ends");
				break;
			case 2: 
				System.out.println("Third Loop Ends");
				break;
			case 3: 
				System.out.println("Fourth Loop Ends");
				break;
			case 4: 
				System.out.println("Orange");
				break;
			}
		}
		
		}
	
	public static void main(String [] args)
	{new ConsTest().looptest1(5,50);

}
}

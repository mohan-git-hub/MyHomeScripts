package com.mypractice;

public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
Day(){
	System.out.println("Constructor Called for "  + this.toString());	
		
	}
	
	void getdayinfo() {
		System.out.println("Current day is " + this.toString());
	}
}

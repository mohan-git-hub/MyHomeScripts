package com.mypractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CallEnumClass {

Day d;

CallEnumClass(Day d){
	this.d = d;
}

public void getDayWork() {
	switch(d) {
	
	case MONDAY:
		System.out.println("Monday is worst");
	break;
	
	case SATURDAY:
	case SUNDAY:
		System.out.println("Weekends are great");
	break;
	
	case FRIDAY:
		System.out.println("Friday is better");
	break;
	
	default:
		System.out.println("Weekdays are so-so");
	break;
	
	}
}

	public static void main(String[] args) {
		
		CallEnumClass CEC = new CallEnumClass(Day.valueOf("SUNDAY"));
		System.out.println(Day.valueOf("TUESDAY").ordinal());
		CEC.getDayWork();
		Day dd = Day.THURSDAY;
		Day dd1 = Day.FRIDAY;
		dd.getdayinfo();
		dd1.getdayinfo();

	}
}

// peter kydd
// a program to apply if and case statements to java 

import java.time.*;
import java.time.temporal.*;


public class Clock {

	public static void main(String[] args){
		//get current time and date
		LocalDateTime now = LocalDateTime.now();
		int hour = now.get(ChronoField.HOUR_OF_DAY)
		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		int month = now.get(ChronoField.MONTH_OF_YEAR);
		int day = now.get(ChronoField.DAY_OF_MONTH);
		int year = now.get(ChronoField.YEAR);
	
		//display greeting
		if(hour <12){
			System.out.println("Good Morning.\n");
		}else if(hour < 17){
			System.out.println("Good Afternoon.\n");
		}else{
			System.out.println("Good Evening.\n");
		}
		
		// begin time message by printing out minutes 
		System.out.println("   ");
		// this line converts from 24hour time to 12 hour time
		// aka gentlemans time
		System.out.println((hour>12)?(hour-12):hour);
		System.out.println("o'clock on ");
		
		//display the name of month
		switch (month){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			
			// display the day and year
				
			System.out.println(" " + day + ", " + year + ".");
		}
	
	}
	
}

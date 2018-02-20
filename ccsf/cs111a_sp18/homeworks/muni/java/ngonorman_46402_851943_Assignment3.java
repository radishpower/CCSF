/*
 * Norman Ngo
 * Assignment3.java
 * CS 111A Practice Program 3
 */

import java.util.Scanner;

class Assignment3 {

	public static void main(String[] args) {
		

		System.out.println("Welcome to Mini Ride Calculator.");
		System.out.print("Which Muni line did you survey? ");
		
		Scanner kb = new Scanner(System.in);
		
		String busLine = kb.next();
		
		System.out.print("How many days did you survey ridership? ");
		
		int days = kb.nextInt();
		
		System.out.print("How many riders did you count? ");
		
		int riders = kb.nextInt();
		
		double avg = (double)riders / (double)days;
		
		
		
		System.out.printf("According to your survey, an average of %.2f people rode the %s per day.", avg, busLine);
	}

}

/*
Welcome to Mini Ride Calculator.
Which Muni line did you survey? L
How many days did you survey ridership? 5
How many riders did you count? 123456
According to your survey, an average of 24691.20 people rode the L per day.
*/

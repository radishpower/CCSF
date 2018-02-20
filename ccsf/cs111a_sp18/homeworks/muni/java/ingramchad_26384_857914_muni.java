import java.util.Scanner;
/*	Chad Ingram
 *  Programming Lab 3
 *  
 
	Write a program that asks the user for survey data about Muni riders, 
	and outputs a summary of that data. 
	Your program should first ask the user which Muni 
	line was surveyed. Then the program asks the user how many day
	s the survey was conducted, storing an integer answer, 
	and then enter the number of riders that were counted (also an int). 
	Your program divides the number of riders by the number of days and 
	outputs the resulting average daily ridership. If that average is not a 
	whole number, make sure you show the decimal value
	(such as in the examples below). You should use a typecast to 
	make this work. Please use "printf" to display the result with 2 digits after
	the decimal point (rounded to the nearest hundredth).

*/
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days, riders;
		float average;
		String line;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Muni Ridership calculator");
		System.out.println("Which Muni line did you survey?");
		line = input.nextLine();
		System.out.println("How many days did you survey ridership? ");
		days = input.nextInt();
		System.out.println("How many riders did you count? ");
		riders = input.nextInt();
		
		average=(float)riders/days;
		
		System.out.printf("According to the your survey, and average of %.2f people.\n" +
		"rode the " + line +" per day.", average);
	}

}
/*
Welcome to the Muni Ridership calculator
Which Muni line did you survey?
N-Judah
How many days did you survey ridership? 
30
How many riders did you count? 
25000
According to the your survey, and average of 833.33 people.
rode the N-Judah per day.


*/

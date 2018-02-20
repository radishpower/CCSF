// Chanel Chen
// Muni Ridership Calculator
// 111A Practice Problem 3
// The user inputs which muni line they did their survey on, the number of days they did their survey for, and the number of riders they surveyed. The program takes the number of riders and divide it with the number of days to find the average of riders on the inputted Muni line per day.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double days, riders, average;
    String muni;
    Scanner scan = new Scanner (System.in);
    System.out.println("Hello, welcome to the Muni Ridership calculator!");
    System.out.println("Which Muni line did you do your survey on?");
    muni = scan.nextLine();
    System.out.println("How many days did you do your survey for?");
    days = scan.nextDouble();
    System.out.println("How many riders did you survey?");
    riders = scan.nextDouble();
    average = (riders/days);
    System.out.printf ("According to your survey, an average of %.2f people rode on the " + muni + " per day.", average);
  }
}

// Sample Output
/*
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Hello, welcome to the Muni Ridership calculator!
Which Muni line did you do your survey on?
 K-Ingleside
How many days did you do your survey for?
 4
How many riders did you survey?
 86421
According to your survey, an average of 21605.25 people rode on the K-Ingleside per day.   
*/
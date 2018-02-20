/*Brandon Wong
CS 111A Practice Problem 3
Main.java
This program takes your input on the number of people you surveyed for a number of days and calculates the average amount of riders for one Muni line.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner fare = new Scanner(System.in);
    System.out.println ("Which Muni line did you survey?");
    String busline = fare.nextLine();
    
    
    Scanner count = new Scanner(System.in);
    double d1, d2;
   
    System.out.print ("How many days did you survey ridership?");
    d1 = count.nextDouble(); 
    
    System.out.print ("How many riders did you count?");
    d2 = count.nextDouble();
    
    System.out.printf("According to your survey, an average of %.2f people rode the "+busline+" per day",d2/d1);
  }
}

/*java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Which Muni line did you survey?
 29-Sunset
How many days did you survey ridership? 30
How many riders did you count? 17669
According to your survey, an average of 588.97 people rode the 29-Sunset per day   
*/
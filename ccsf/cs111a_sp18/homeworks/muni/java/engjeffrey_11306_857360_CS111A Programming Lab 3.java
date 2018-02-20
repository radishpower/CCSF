/* Jeffrey Eng
CS 111A Practice Problem 3
Main.java
Muni Ridership Calculator
This is a program that calculates the average amount of people that rode the specific muni line that was asked in the question, based on the number of riders that were on the buses. 
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  Scanner Muni = new Scanner (System.in);
  System.out.println("Welcome to the Muni ridership Calculator!");
  System.out.println("Which Muni line did you survey?");
  String message = Muni.nextLine();
  
  Scanner num = new Scanner (System.in);
  double d1 , d2;
  
  System.out.print("How many days did you survey the muni line?");
  
  d1 = num.nextDouble();
  
  System.out.print("How many riders did you count?");
  
  d2 = num.nextDouble();
 
  System.out.printf("According to your survey , an average of %.2f riders rode the "+message+" per day" , d2/d1);
 
  }
}


/*java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Welcome to the Muni ridership Calculator!
Which Muni line did you survey?
 K-ingleside
How many days did you survey the muni line? 20
How many riders did you count? 5
According to your survey , an average of 0.25 riders rode the K-ingleside per day
*/

 
 
 
 
 
  
 
/*
Prakash Khadka
MuniRidership.java
Programming Lab 3: Muni Ridership
This program performs simple calculations based on user input
*/

import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    
    String name; 
    int i1,i2;
    double result;
    
    Scanner consoleIn = new Scanner(System.in);
    
    System.out.println("Welcome to the Muni Ridership Calculator.");
    //first = consoleIn.nextLine();
    
    System.out.println("Which Muni line did you survey?");
    name = consoleIn.nextLine();
    
    System.out.println("How many days did you survey ridership?");
     i1 = consoleIn.nextInt();

    
    System.out.println("How many riders did you count?");
     i2 = consoleIn.nextInt();

    // Calculatio of average number of people rode muni per day
    result=i2/(double)i1;  
   
    System.out.printf("According to your survey, an average of %,.2f people rode the "+ "%s per day",result,name);
  }
}
/*
Welcome to the Muni Ridership Calculator.
Which Muni line did you survey?
 K-Ingleside
How many days did you survey ridership?
 5
How many riders did you count?
 123456
According to your survey, an average of 24,691.20 people rode the K-Ingleside per day   
Welcome to the Muni Ridership Calculator.
Which Muni line did you survey?
 N-Judah
How many days did you survey ridership?
 30
How many riders did you count?
 25000
According to your survey, an average of 833.33 people rode the N-Judah per day  
*/



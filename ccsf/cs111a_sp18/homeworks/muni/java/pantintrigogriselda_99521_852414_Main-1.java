/*
Griselda Pantin-Trigo
main.java
CS111A Programming Lab #3: Muni Ridership
asks user about survey data and ouputs summary
*/


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
    System.out.println("Welcome to the Muni Ridership Calculator.");
    
    Scanner scan = new Scanner (System.in);
    Scanner consoleIn = new Scanner(System.in);
    
    String muniLine;
    int days, riders;
    float avg_riders;
    
    System.out.println("Which muni line did you survey?");
    muniLine = scan.next();
    
    System.out.println("How many days did you survey ridership?");
    days = consoleIn.nextInt();
    
    System.out.println("How many riders did you count?");
    riders = consoleIn.nextInt();
    
    avg_riders = (float)riders / days;
  
    System.out.printf("According to your survey, an average of " + "%10.2f" + " people rode the " + muniLine + " per day.", avg_riders);
   
  }
}

/*

java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Welcome to the Muni Ridership Calculator.
Which muni line did you survey?
 K-Ingleside
How many days did you survey ridership?
 87
How many riders did you count?
 97897
According to your survey, an average of    1125.25 people rode the K-Ingleside per day.   

*/
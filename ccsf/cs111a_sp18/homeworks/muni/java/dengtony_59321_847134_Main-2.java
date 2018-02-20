//Tony Deng
//Main
//Muni Survey
//111A Practice Problem 3
//Muni Survey asks user questions then displays a Summary of the Survey

// the formalites is the second part I worked on

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
  Scanner muni = new Scanner(System.in);
  
  String Muni; // ;-; can't use float bc Muni lines are not an float point
   
  float day, count; // Have to seperate
  
  // storage is the last part I worked on
  // did the same thing on the output
  System.out.println("Welcome to the Muni Ridership Calculator." + 
  
  //stuck here for 10 mins - mixed up println with nextLine thought it was printLine and nextIn ;-; 
  
  "\n Which Muni line did you survey?");
  
  Muni = muni.nextLine(); // Store Muni line
  // at one point mixed Muni and line got Error
  
  System.out.println("How many days did you survey ridership?"); 
  
  day = muni.nextInt(); // Store # of days
  
  System.out.println("How many riders did you count?"); 

  count = muni.nextInt(); // Store # of people counted
  
  //the output is first part I worked on 
  //I copyed the sample input/output on linux and modified to be this
  System.out.printf("Summary of Muni Ridership Calculator." + // so glad we can just use one printf for the entire thing saved so much time
  "\n Which Muni line did you survey? " + Muni +
  "\n How many days did you survey ridership? " + day +
  "\n How many riders did you count?  " + count +
  "\n According to your survey, an average of %,.2f people" +
  "\n rode the " + Muni + " per day.", count / day);
  }  
}

/* Sample Output
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Welcome to the Muni Ridership Calculator.
 Which Muni line did you survey?
 5-Fulton
How many days did you survey ridership?
 7
How many riders did you count?
 100000
Summary of Muni Ridership Calculator.
 Which Muni line did you survey? 5-Fulton
 How many days did you survey ridership? 7.0
 How many riders did you count?  100000.0
 According to your survey, an average of 14,285.71 people
 rode the 5-Fulton per day.   
 */
//Trina Lewis
//CS 111A Practice Problem 3 
//Main.java calculates the average amount of people who rode on muni per day based on a survey

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String line;
    int days, riders;
    double average;
    
    Scanner muni = new Scanner(System.in);
    System.out.println("Which Muni line did you survey?");
    line = muni.nextLine();
    System.out.println("How many days did you conduct the survey?");
    days = muni.nextInt();
    System.out.println("How many riders were counted?");
    riders = muni.nextInt();
    average = (double)riders/days;
    System.out.printf("According to your survey, an average of %.2f people rode the "+line+" per day.", average);
  }
}

/*
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Which Muni line did you survey?
 M-Ocean
How many days did you conduct the survey?
 14
How many riders were counted?
 956
According to your survey, an average of 68.29 people rode the M-Ocean per day.
*/
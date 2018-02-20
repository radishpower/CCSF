/* Michael A. Thiessen
Muni Ridership Survey
Class 111A Practice Problem 3
Program asks the user a few questions and calculates the average number of users for the specified muni line
*/

import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    String muni_name;
    int num_riders, num_days;
    double avg_riders;
    Scanner keyIn = new Scanner (System.in);

    System.out.println("Hello, welcome to the Muni Ridership survey.");
    System.out.print("Which Muni line did you take?");
    muni_name = keyIn.nextLine();
    System.out.print("How many days was the survey conducted?");
    num_days = keyIn.nextInt();
    System.out.print("How many riders were counted?");
    num_riders = keyIn.nextInt();

    avg_riders = num_riders/(double)num_days;

    System.out.printf("According to your survey, an average of %,.2f"
         + " people\nrode the %s per day.\n", avg_riders, muni_name);
  }
}

/*
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Hello, welcome to the Muni Ridership survey.
Which Muni line did you take? Muni Metro
How many days was the survey conducted? 25
How many riders were counted? 2500
According to your survey, an average of 100.00 people
rode the Muni Metro per day.
*/
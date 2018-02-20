//Jinyan Li
//CS 111A Practice Problem 3 
//Muni Ridership Survey Program:asks the user for survey data about Muni riders, and outputs a summary of that data. 

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    Scanner scan = new Scanner (System.in);
    
    int days, riders;
    double avg_people;
    String muniline;
  
      System.out.println ("Welcome to the Muni Ridership Calculator.\nWhich Muni line did you survey?");
       muniline = scan.nextLine();
      System.out.println ("How many days did you survey ridership?");
       days = scan.nextInt();
      System.out.println("How many riders did you count?");
       riders = scan.nextInt();
       avg_people=riders/(double)days;
      System.out.printf("According to your survey, an average of %,.2f people \n rode the %s per day.", avg_people,muniline);
      
      }
}
/*Simple Output:
Welcome to the Muni Ridership Calculator.
Which Muni line did you survey?
 L Taraval
How many days did you survey ridership?
 7
How many riders did you count?
 3503
According to your survey, an average of 500.43 people 
 rode the L Taraval per day.         
 */
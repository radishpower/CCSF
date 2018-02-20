import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner consoleIn = new Scanner(System.in);
  
  String strmuniline; 
  int intdays, intpassngers;
  
  System.out.print("*******************************\n");
  System.out.print("* Welcome to the surveymonkey *\n");
  System.out.print("*******************************\n\n");
  
  System.out.print("Which MUNI line did you use?");
  strmuniline = consoleIn.nextLine();
    System.out.print("How many days did you work on this survey?");
  intdays = consoleIn.nextInt();    
    System.out.printf("How many people did you count on those %d days? ",intdays);
  intpassngers = consoleIn.nextInt();    
  
  System.out.printf("\nAccording to your survey, an average of %,.2f people ride %s each day. \n",(double)intpassngers/intdays, strmuniline);
  
/*
*******************************
* Welcome to the surveymonkey *
*******************************

Which MUNI line did you use? J Church
How many days did you work on this survey? 5
How many people did you count on those 5 days?  20000

According to your survey, an average of 4,000.00 people ride J Church each day. 
   
*/
  }
}
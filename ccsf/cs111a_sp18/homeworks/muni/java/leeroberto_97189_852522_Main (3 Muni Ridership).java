/*
 
 CS111A
Roberto Lee

Muni Rider Suvey
What Muni line did you survey?
How many days did you performed the survey?
How many riders did you count?
Averages #riders and #days

*/



import java.util.Scanner;


class Main

{

  public static void main(String[] args)

  {

    Scanner consoleIn = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);
    
    String line;
    float days, riders, result;
    

    System.out.print("Please enter the Muni line you survey:" );
    
    
    line = scan.nextLine();
    
    System.out.println("Please enter the number of days you did the survey:");
    
    days = consoleIn.nextFloat();
    
    System.out.print("Please enter the number of riders you count:");
    
    riders = consoleIn.nextFloat();

    result = riders/days;
    
    System.out.printf("The average of people that takes the line " + line + " is %.2f\n" ,result);




  }

}


/*
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Please enter the Muni line you survey: Geary 38
Please enter the number of days you did the survey:
 5
Please enter the number of riders you count: 12345
The average of people that takes the line Geary 38 is 2469.00
   
   
*/


/*Dillion Lee CS111A Java  Practice problem 3 
This program is used to see how much people is surveyed on Muni in one day.
*/


import java.util.Scanner;

class Main
{
  

   public static void main (String[] args)
   {
      String muni;

      Scanner scan = new Scanner (System.in);

      System.out.println ("Welcome to the Muni Ridership Calculator\n" +
      "Which Muni line did you take?" );
      muni = scan.nextLine(); 
      
      
      float days;
      
       System.out.println("How many days did you survey ridership?");
          
         days = scan.nextInt();

      
      float count;
      
      System.out.println("How many riders did you count?");
      // this print "L lowercase not #1"
      
      count = scan.nextInt();
         


     System.out.printf("Thank you for taking our survey, according to our surveys:" +  "%.2f" +
      "people rode on the "  +  muni  + " per day", count / days);
  
  }  

   


  }

/* Sample output

java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Welcome to the Muni Ridership Calculator
Which Muni line did you take?
 K
How many days did you survey ridership?
 5
How many riders did you count?
 123456
Thank you for taking our survey, according to our surveys:24691.20people rode on the K per day   


*/




  

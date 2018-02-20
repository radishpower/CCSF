/*
  Jesse Espinoza
  111A Programming Lab 3
  This program asks the user for the muni line they surveyed,
  the number of days surveyed, and the number of riders. It then
  takes the average number of riders per day and formats it into
  sentence that prints to the console so that the user can read it.
 */


import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Muni Ridership Calculator.");
        
        String muni_line;
        float ridership;
        float riders;
        
        Scanner consolein = new Scanner(System.in);
        
        System.out.print("Which Muni line did you survey? ");
        muni_line = consolein.nextLine();
        
        System.out.print("How many days did you survey ridership? ");
        ridership = consolein.nextFloat();
        
        System.out.print("How many days did you survey ridership? ");
        riders = consolein.nextFloat();
        
        System.out.printf("According to your survey, an average of %.2f people rode the %s per day.", riders / ridership, muni_line);
        
        /*
          java version "1.8.0_31"
          Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
          Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
         */
        
        
    }
}
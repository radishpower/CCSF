
/**
 *
 * @author guillermohernandez
 */
/* File name: survey.java

   Name of the Assignment: Programming Lab 3: Muni Ridership

   Class: 111A Practice - Problem 3

   - The program show the result of the average of people that 
     get ride in x Muni Line per day.

*/


//Import the class Scanner from the package java.util 
import java.util.Scanner;



class survey

{

  public static void main(String[] args)

  {

    //Declare variables object type
    Scanner scan = new Scanner (System.in);  
    Scanner consoleIn = new Scanner(System.in);

    //Declare varibales
    int days, riders;
    double averg;
    String muni_line;
        
    //Print out the title of the program
    System.out.println("***** Welcome to the Muni Ridership Calculator. ******");
    //Print out the question 1 
    System.out.println("Which Muni line did you survey? ");
    //Asign the name of the Muni-Line to the variable muni_line
    muni_line = scan.nextLine();
    //Print out the question 2
    System.out.println("How many days did you survey ridership?");
    //Asign the number of days to the variable days
    days = consoleIn.nextInt();
    //Print out the question 3
    System.out.println("How many riders did you count? ");
    //Asign the number of riders to the variable riders
    riders = consoleIn.nextInt();
    
    //The variable averg get the result of riders/days, and the typecast (double)
    //allow show the decimal value.
    averg = (double)riders / days; 
    
    //Print out the name of the muni line and the result 
    System.out.printf("According to your survey, an average of  %,.2f people rode the "
                        + muni_line + " per day \n", averg);

  }

}



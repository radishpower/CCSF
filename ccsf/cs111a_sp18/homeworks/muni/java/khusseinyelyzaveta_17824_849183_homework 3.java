/* CS 111 A Hw#3 Yelyzaveta Khussein
Write a program that asks the user for survey data about Muni riders, and outputs a summary of that data. Your program should first ask the user which Muni line was surveyed. Then the program asks the user how many days the survey was conducted, storing an integer answer, and then enter the number of riders that were counted (also an int). Your program divides the number of riders by the number of days and outputs the resulting average daily ridership. If that average is not a whole number, make sure you show the decimal value (such as in the examples below). You should use a typecast to make this work. Please use "printf" to display the result with 2 digits after the decimal point (rounded to the nearest hundredth).

*/



import java.util.Scanner;



class Main

{

  public static void main(String[] args)

  {

    Scanner consoleIn = new Scanner(System.in);
    
    String Muni;
    
    int num1, num2, num3;

    double d1, d2;



    System.out.print("Which muni line was surveyed? ");

    Muni = consoleIn.nextLine();
    System.out.print("How many days did you survey?");
num1 = consoleIn.nextInt();
System.out.print("How many riders did you count?");
num2 = consoleIn.nextInt();
System.out.print("The average daily ridership is " + num2 / num1);
num3 = consoleIn.nextInt();


  }

}

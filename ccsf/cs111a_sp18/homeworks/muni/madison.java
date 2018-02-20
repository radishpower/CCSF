/* Madison Jimenez
Main.java
Muni Ridership 111A Practice Problem 3
Calculates the average of the number of people that ride the Muni.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 String message;
 int i1, i2;
 
  Scanner muni = new Scanner(System.in);
    System.out.println("Welcome to the Muni Ridership Calculator.");
    System.out.println("Which Muni line did you survey?");
    message = muni.nextLine();
    System.out.println("How many days did you survey ridership?");
    i1 = muni.nextInt();
    System.out.println("How many riders did you count?");
    i2 = muni.nextInt();
    System.out.printf("According to your survey, an average of %,.2f",(i2*1.0/i1));
    System.out.println(" people rode the " +message+ " per day.");
 
  }
}
/*Output:
Welcome to the Muni Ridership Calculator.
Which Muni line did you survey?
Milbrae
How many days did you survey ridership?
5
How many riders did you count?
20
According to your survey, an average of 4.00 people rode the Milbrae per day.
*/


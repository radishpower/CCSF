/* Craig Persiko - CS 111A - Interest.java
   Sample program to demonstrate i/o, calculations and if-statement.

   Interest Program
   Allows user to enter the amount of an investment.
   Investments under $50,000 earn 5% interest, and investments equal to
   or above $50,000 earn 6% interest.  The dollar amount of interest
   earned is output by the program.
*/

import java.util.Scanner;

public class Interest
{
  public static void main(String[] args)
  {
    double inv_amount, int_earned;
    Scanner scan = new Scanner (System.in);

    System.out.println("Welcome to Investment World\nEnter amount to be invested");
    inv_amount = scan.nextDouble();

    if(inv_amount < 50000.0)
      int_earned = inv_amount * 0.05; // 5% interest
    else
      int_earned = inv_amount * 0.06; // 6% interest
    // No curly braces are needed above because only one line is
    // executed in each case.

    System.out.println("Your investment earns $" + int_earned
                       + " interest in one year.");
  }
}

/*  SAMPLE OUTPUT:

Welcome to Investment World
Enter amount to be invested
100
Your investment earns $5.0 interest in one year.

    -- Trying a different value --

Welcome to Investment World
Enter amount to be invested:
100000
Your investment earns $6000.0 interest in one year.

*/

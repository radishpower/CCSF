/* Craig Persiko - CS 111A - MoreInterest.java
   Sample program to demonstrate i/o, calculations and if-statement.

   This modified version of the original Interest.java has more
   conditions - more interest rates.

   Interest Program
   Allows user to enter the amount of an investment.
   Investments earn different interest rates.
   The dollar amount of interest
   earned is output by the program.
*/

import java.util.Scanner;

public class MoreInterest
{
  public static void main(String[] args)
  {
    double inv_amount, int_earned;
    Scanner scan = new Scanner (System.in);

    System.out.println("Welcome to Investment World\nEnter amount to be invested");
    inv_amount = scan.nextDouble();

    if(inv_amount < 50000.0)
    {
      if (inv_amount <= 0)
      {
        int_earned = 0;
        System.out.println("You need to have money to make interest");
      }
      else
      {
        int_earned = inv_amount * 0.05; // 5% interest
        System.out.println("You're earning 5% interest");
      }
    }
    else if(inv_amount < 100000.0)
      int_earned = inv_amount * 0.06; // 6% interest
    else if(inv_amount < 200000.0)
      int_earned = inv_amount * 0.07; // 7% interest
    else if(inv_amount < 300000.0)
      int_earned = inv_amount * 0.08; // 8% interest
    else
      int_earned = inv_amount * 0.09; // 9%
    // No curly braces are needed above because only one line is
    // executed in each case.

    System.out.println("Your investment earns $" + int_earned
                       + " interest in one year.");
    System.out.println("Your total in the bank is: $" + 
                        (inv_amount + int_earned));
  }
}

/* Sample Output:

[cpersiko@fog cs111a]$ javac MoreInterest.java
[cpersiko@fog cs111a]$ java MoreInterest
Welcome to Investment World
Enter amount to be invested
199
You're earning 5% interest
Your investment earns $9.950000000000001 interest in one year.
Your total in the bank is: $208.95
[cpersiko@fog cs111a]$ java MoreInterest
Welcome to Investment World
Enter amount to be invested
10000
You're earning 5% interest
Your investment earns $500.0 interest in one year.
Your total in the bank is: $10500.0
[cpersiko@fog cs111a]$ java MoreInterest
Welcome to Investment World
Enter amount to be invested
100000
Your investment earns $7000.000000000001 interest in one year.
Your total in the bank is: $107000.0
[cpersiko@fog cs111a]$ java MoreInterest
Welcome to Investment World
Enter amount to be invested
1000000
Your investment earns $90000.0 interest in one year.
Your total in the bank is: $1090000.0
[cpersiko@fog cs111a]$ java MoreInterest
Welcome to Investment World
Enter amount to be invested
-5
You need to have money to make interest
Your investment earns $0.0 interest in one year.
Your total in the bank is: $-5.0
[cpersiko@fog cs111a]$

*/

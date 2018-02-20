/* Craig Persiko - CS 111A
   BooleanApp.java
   Demonstrates use of Boolean variables and multi-way if statements.
*/

import java.util.Scanner;

public class BooleanApp
{
  public static void main(String[] args)
  {
    int age;
    boolean workingAge;
    Scanner scan = new Scanner (System.in);

    System.out.println("Please enter your age");
    age = scan.nextInt();

    if(age < 13)
    {
      System.out.println("You're a child");
      workingAge = false; // this line is unnecessary because
                          // workingAge is set below, but instead
                          // of that line, lines like this could be
                          // added after each output below.
    }
    else if(age < 18)
      System.out.println("You're a teenager");
    else if(age < 65)
      System.out.println("You're a working adult");
    else
      System.out.println("You're a retiree");

    workingAge = age < 65  && age >= 18;
    if (workingAge)
      System.out.println("Want a job?");
  }
}

/* Sample output:

Please enter your age
5
You're a child

Please enter your age
31
You're a working adult
Want a job?

Please enter your age
70
You're a retiree

Please enter your age
16
You're a teenager

*/

/* Craig Persiko - CS 111A
   BooleanAppVariation.java
   Demonstrates use of Boolean variables and multi-way if statements. 
   This is a variation of the original program, as done in class 9/8/09.
*/

import java.util.Scanner;

public class BooleanAppVariation
{
  public static void main(String[] args)
  {
    int age;
    boolean workingAge = false;
    Scanner scan = new Scanner (System.in);

    System.out.println("Please enter your age");
    age = scan.nextInt();

    if(age < 13)
    {
      System.out.println("You're a child");
    }
    else if(age < 18)
      System.out.println("You're a teenager");
    else if(age < 65)
    {
      System.out.println("You're a working adult");
      workingAge = true;
    }
    else
    {
      System.out.println("You're a retiree");
    }

    // the following line sets workingAge correctly, but is unneeded 
    // because it's set correctly above as well.
    workingAge = age < 65  && age >= 18;
    if (workingAge) // could be "if (workingAge == true)"
      System.out.println("Want a job?");
    if (workingAge == false)  // could be "else" or "if (age >= 65 || age < 18)"
      System.out.println("fewer jobs available");

    if (age == 16 || age == 18 || age == 21 || age > 12 && age < 20)
      System.out.println("You're at a special age");

  }
}

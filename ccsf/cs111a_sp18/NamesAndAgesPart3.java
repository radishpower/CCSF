/* Craig Persiko
   CS 111A In-class exercise solution:
   Write a program to input the names and ages of 2 people.
   Then output if one or both people are between 18 and 65 years old.
*/

import java.util.Scanner;

public class NamesAndAgesPart3
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);

    String name1, name2;
    int age1, age2;
    boolean workingAge2;

    System.out.println("Please enter first person's name: ");
    name1 = scan.nextLine();

    System.out.println("Please enter first person's age: ");
    age1 = scan.nextInt();

    scan.nextLine(); //dispose of newline char

    System.out.println("Please enter second person's name: ");
    name2 = scan.nextLine();

    System.out.println("Please enter second person's age: ");
    age2 = scan.nextInt();

    workingAge2 = age2 >= 18 && age2 <= 65;

    if(age1 >= 18 && age1 <= 65)
      if (workingAge2)
        System.out.println("Both people are between 18 and 65");
      else
        System.out.println(name1 + " is between 18 and 65, but " + name2 + " is not.");
    else if (workingAge2)
      System.out.println(name2 + " is between 18 and 65, but " + name1 + " is not.");
    else
      System.out.println("Neither person is between 18 and 65.");
    }
}

/* Sample Output:

-bash-3.2$ java NamesAndAgesPart3
Please enter first person's name:
Craig
Please enter first person's age:
37
Please enter second person's name:
Serafina
Please enter second person's age:
7
Craig is between 18 and 65, but Serafina is not.
-bash-3.2$ java NamesAndAgesPart3
Please enter first person's name:
Tobias
Please enter first person's age:
5
Please enter second person's name:
Serafina
Please enter second person's age:
7
Neither person is between 18 and 65.
-bash-3.2$ java NamesAndAgesPart3
Please enter first person's name:
Geoff
Please enter first person's age:
37
Please enter second person's name:
Craig
Please enter second person's age:
37
Both people are between 18 and 65
-bash-3.2$

*/

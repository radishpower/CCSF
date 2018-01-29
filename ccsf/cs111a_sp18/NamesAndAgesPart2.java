/* Craig Persiko
   CS 111A In-class exercise solution:
   Write a program to input the names and ages of 2 people. 
   Then output which name is longer or if they're equal,
   and if the ages are the same or who's older.
*/   

import java.util.Scanner;

public class NamesAndAgesPart2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);

    String name1, name2;
    int age1, age2, length1, length2;

    System.out.println("Please enter first person's name: ");
    name1 = scan.nextLine();
    
    System.out.println("Please enter first person's age: ");
    age1 = scan.nextInt();

    scan.nextLine(); //dispose of newline char
    
    System.out.println("Please enter second person's name: ");
    name2 = scan.nextLine();
    
    System.out.println("Please enter second person's age: ");
    age2 = scan.nextInt();
    
    length1 = name1.length();
    length2 = name2.length();

    if(length1 > length2)
      System.out.println("name 1 is longer");
    else if(length1 == length2)
      System.out.println("they're equal");
    else
      System.out.println("name 2 is longer");

    if(age1 == age2)
      System.out.println("Ages are equal");
    else if(age1 > age2)
      System.out.println("Person 1 is older");
    else 
      System.out.println(name2 + " is older");
    }
}

/* Sample Output:

-bash-3.2$ java NamesAndAgesPart2
Please enter first person's name: 
Craig
Please enter first person's age: 
36
Please enter second person's name: 
James
Please enter second person's age: 
36
they're equal
Ages are equal
-bash-3.2$ java NamesAndAgesPart2
Please enter first person's name: 
Craig
Please enter first person's age: 
36
Please enter second person's name:
Tobias
Please enter second person's age: 
4
name 2 is longer
Person 1 is older
-bash-3.2$ java NamesAndAgesPart2
Please enter first person's name: 
Craig
Please enter first person's age: 
36
Please enter second person's name: 
Sue
Please enter second person's age: 
40
name 1 is longer
Sue is older
-bash-3.2$ 

*/

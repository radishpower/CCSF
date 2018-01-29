/* Craig Persiko
   CS 111A In-class exercise solution:
   Write a program to input the names and ages of 2 people. 
   Then output which name is longer, and if the ages are the same or not.
*/   

import java.util.Scanner;

public class NamesAndAges
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);

    String name1, name2;
    int age1, age2, length1;

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
    // length can be stored in variable as above 
    // or calculated directly as below 
    if(length1 > name2.length())
      System.out.println("name 1 is longer");
    else
      System.out.println("name 2 is longer or they're equal");

    if(age1 == age2)
      System.out.println("Ages are equal");
    else
      System.out.println("Ages are not equal");
    }
}

/* Sample Output:

-bash-3.2$ java NamesAndAges
Please enter first person's name: 
Craig
Please enter first person's age: 
36
Please enter second person's name: 
Serafina
Please enter second person's age: 
6
name 2 is longer or they're equal
Ages are not equal
-bash-3.2$ java NamesAndAges
Please enter first person's name: 
Constance
Please enter first person's age: 
25
Please enter second person's name: 
Rose
Please enter second person's age: 
25
name 1 is longer
Ages are equal

*/


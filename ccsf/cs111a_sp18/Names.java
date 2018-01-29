/* Craig Persiko
   Names.java
   CS 111A Solution to in-class exercise:
   input user's first name, then last name, and store them into two separate variables.
    Output them in reverse order with a comma between them.
*/

import java.util.Scanner;

class Names
{
  public static void main(String[] args)
  {
    String first, last;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter your first name: ");
    first = scan.nextLine();

    System.out.print("Enter your last name: ");
    last = scan.nextLine();

    System.out.println(last + ", " + first);
  }
}

/* Sample Output:

[cpersiko@milhouse ~]$ java Names
Enter your first name: Craig
Enter your last name: Persiko
Persiko, Craig
[cpersiko@milhouse ~]$ 

*/


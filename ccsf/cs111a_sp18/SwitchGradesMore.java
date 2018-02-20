/* Craig Persiko  -  SwitchGradesMore.java
   Sample program to demonstrate use of switch statement.
   Had more to it than the original version.
   Done in class 9/10/09
*/

import java.util.Scanner;

class SwitchGradesMore
{
  public static void main(String args[])
  {
    char grade, mid_term;
    String input;
    Scanner keyIn = new Scanner (System.in);

    System.out.println("Enter your mid-term grade");
    input = keyIn.nextLine();
    if(input.length() > 0) // if one or more characters entered
      mid_term = input.charAt(0); // first character from the string
    else // empty string was entered
      mid_term = 'w';

    System.out.println("Enter your semester grade");
    input = keyIn.nextLine();
    grade = input.charAt(0); // first character from the string

    switch (grade)
    {
      case 'a': case 'A':
        System.out.println("Excellent!");
        break;
      case 'b': case 'B':
        System.out.println("Good job!");
        break;
      case 'c': case 'C':
        System.out.println("Not bad!");
        break;
      case 'd': case 'D':
        System.out.println( "You passed!");
        switch (Character.toLowerCase(mid_term))
        {
          case 'a':  // both A and B produce this result:
          case 'b':
            System.out.println( "You started out very well!");
            break;
          case 'f': case 'e':
            System.out.println("You improved!");
        }
        break;
      case 'f': case 'F': case 'e': case 'E':
        System.out.println("You need to study more!");
        if(mid_term == 'a' || mid_term == 'A' || mid_term == 'b' || mid_term == 'B')
          System.out.println("You were doing much better before!");
        break;
      default:
        System.out.println("What grading system are you using?!");
    }
  }
}

/* Sample Output:

Enter your mid-term grade
a
Enter your semester grade
d
You passed!
You started out very well!

Enter your mid-term grade
F
Enter your semester grade
F
You need to study more!

Enter your mid-term grade
w
Enter your semester grade
w
What grading system are you using?!

Enter your mid-term grade
F
Enter your semester grade
D
You passed!
You improved!

*/

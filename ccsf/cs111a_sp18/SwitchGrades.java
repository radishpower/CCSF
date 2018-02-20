/* Craig Persiko  -  SwitchGrades.java
   Sample program to demonstrate use of switch statement.
*/

import java.util.Scanner;

class SwitchGrades
{
  public static void main(String args[])
  {
    char grade, mid_term;
    String input, output;
    Scanner keyIn = new Scanner (System.in);

    System.out.println("Enter your mid-term grade");
    input = keyIn.nextLine();
    mid_term = input.charAt(0); // first character from the string

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
        output = "You passed!\n";
        switch (Character.toLowerCase(mid_term))
        {
          case 'a':  // both A and B produce this result:
          case 'b':
            output += "You started out very well!";
            break;
          case 'f':
            output += "You improved!";
        }
        System.out.println(output);
        break;
      case 'f': case 'F':
        System.out.println("You need to study more!");
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

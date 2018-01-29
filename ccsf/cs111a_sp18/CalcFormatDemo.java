/* CalcFormatDemo.java
   Craig Persiko
   CS 111A Sample Program demonstrating behavior of calculations and printf formatting
   with floating point and integer variables.
*/

import java.util.Scanner;

public class CalcFormatDemo
{
  public static void main(String[] args)
  {
    Scanner consoleIn = new Scanner(System.in);
    int i1, i2;
    double d1, d2;

    System.out.print("Please enter two integers, separated by a space: ");
    i1 = consoleIn.nextInt();
    i2 = consoleIn.nextInt();

    System.out.println(i1 + " * " + i2 + " = " + i1 * i2);
    System.out.println(i1 + " / " + i2 + " = " + i1 / i2);
    System.out.println(i1 + " % " + i2 + " = " + i1 % i2);

    System.out.print("Please enter two floating-point numbers, separated by a space: ");
    d1 = consoleIn.nextDouble();
    d2 = consoleIn.nextDouble();

    System.out.println(d1 + " * " + d2 + " = " + d1 * d2);
    System.out.println(d1 + " / " + d2 + " = " + d1 / d2);
    System.out.println(d1 + " % " + i2 + " = " + d1 % i2);

    System.out.println("Formatting those same calculations to show commas for thousands,");
    System.out.println("and just 1 digit after the decimal point gives us:");
    System.out.printf("%,.1f * %,.1f = %,.1f \n", d1, d2, d1 * d2);
    System.out.printf("%,.1f / %,.1f = %,.1f \n", d1, d2, d1 / d2);
    System.out.printf("%,.1f %% %,d = %,.1f \n", d1, i2, d1 % i2);

  }
}

/*
Sample Output:

-bash-3.2$ java CalcFormatDemo
Please enter two integers, separated by a space: 2000 1500
2000 * 1500 = 3000000
2000 / 1500 = 1
2000 % 1500 = 500
Please enter two floating-point numbers, separated by a space: 123.456 0.789
123.456 * 0.789 = 97.406784
123.456 / 0.789 = 156.47148288973384
123.456 % 1500 = 123.456
Formatting those same calculations to show commas for thousands,
and just 1 digit after the decimal point gives us:
123.5 * 0.8 = 97.4
123.5 / 0.8 = 156.5
123.5 % 1,500 = 123.5
-bash-3.2$

*/

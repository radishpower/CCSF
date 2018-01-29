/* Craig Persiko
   StringDemo.java

   This program demonstrates how objects and
   object reference variables behave, and it
   shows a couple of String methods.
*/

class StringDemo
{
    public static void main(String[] args)
    {
      String x = "Hello";
      String y, z;

      y = x;                // Make y refer to the same String x refers to
      x = x.toUpperCase();  // The String referred to by x is not changed.
                            // Instead, x is changed to refer to a new String,
                            // which is the upper case version of the original.
      System.out.print(x);  // Print x without a newline at the end.
      System.out.println(y);

      z = "World".toUpperCase(); // "World" is a reference to a String object.
      System.out.println(x + " " + z);

      // Beware: adding chars will simply add their numeric codes:
      System.out.println(x.charAt(0) + y.charAt(1) + x.charAt(2)
                         + y.charAt(3) + x.charAt(4));

      // Addding a char (or numeric variable) to a String will concatenate them:
      System.out.println("" + x.charAt(0) + y.charAt(1) + x.charAt(2)
                         + y.charAt(3) + x.charAt(4));

    }
}

/* OUTPUT:

HELLOHello
HELLO WORLD
436
HeLlO

*/

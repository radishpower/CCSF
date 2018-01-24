/* Craig Persiko
   HelloWorldApp.java
   Sample program to demonstrate JOptionPane
   input and output, and console output.

   NOTE: This GUI i/o will not work on hills.
*/

import javax.swing.JOptionPane;

public class HelloWorldApp {
    public static void main(String[] args) {
        String response;
        int age;

        JOptionPane.showMessageDialog(null, "Hello World!");
        response = JOptionPane.showInputDialog("Enter your age");
        age = Integer.parseInt(response);
        System.out.println("In 2 years, you'll be: " + (age + 2));
        // parentheses are needed above to add age + 2
        // before adding to string (try without inner parentheses)

        System.exit(0);  // needed to end program when GUI used
    }
}



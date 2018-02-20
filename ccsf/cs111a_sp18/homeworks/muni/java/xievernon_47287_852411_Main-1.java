import java.util.Scanner;

class Main

{

  public static void main(String[] args)

  {

    Scanner consoleIn = new Scanner(System.in);
    Scanner scan = new Scanner (System.in);
    
    int i1, i2;

    double d1, d2, d3;

    String b1;
    
    

    System.out.printf("Welcome to the Muni Ridership Calculator. \n");
    System.out.printf("Which Muni line did you survey? \n");

    b1 = scan.nextLine();
    
    System.out.printf("How many days did you survey ridership? \n");

    d1 = consoleIn.nextInt();
    
    System.out.printf("How many riders did you count? \n");
    
    d2 = consoleIn.nextInt();
    d3 = (d2 / d1);
    
    System.out.printf("According to your survey, an average of %.2f people rode the %s per day. \n", d3, b1);
    
  }

}

// Sample Output
/*
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Welcome to the Muni Ridership Calculator. 
Which Muni line did you survey? 
 N-Judah
How many days did you survey ridership? 
 5
How many riders did you count? 
 1234567
According to your survey, an average of 246913.40 people rode the N-Judah per day.
*/

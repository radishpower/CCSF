//James Fyfe Java 111A Practice Problem 3. This program asks for information from the user's survey and outputs average daily ridership

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  
  String muni;
  int days, riders;
  double avg;
  
  System.out.println("Welcome to the Muni Ridership Calculator. Which Muni line did you survey?");
    muni = scan.nextLine();
  
  System.out.println("How many days did you survey?");
    days = scan.nextInt();

  System.out.println("How many riders did you count?");
    riders = scan.nextInt();
    
    avg = (double)riders / (days);
  
  

System.out.printf ("The daily ridership for %s is %.2f" ,muni, avg);

  }
}

/* Sample output
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
Welcome to the Muni Ridership Calculator. Which Muni line did you survey?
 L-Taraval
How many days did you survey?
 4
How many riders did you count?
 52434
The daily ridership for L-Taraval is 13108.50   */
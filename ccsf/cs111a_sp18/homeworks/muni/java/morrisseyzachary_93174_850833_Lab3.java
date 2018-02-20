///Zach Morrissey Lab 3Java class 111a. The program tells you the average daily readership of whichever line you input. 

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line;
    int day, riders; 
    double avg;
    
    System.out.println("What line have you surveyed?");
    line = sc.nextLine();
    
    System.out.println("How many days have you counted?"); 
    day = sc.nextInt();
    
    System.out.println("How many riders?");
    riders = sc.nextInt();
    avg = (double)riders / (day);
    
    System.out.printf("The daily ridership for %s is %.2f",line, avg); 
  }
}
/*Sample output
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
What line have you surveyed?
 M-line
How many days have you counted?
 6
How many riders?
 4759
The daily ridership for M-line is 793.1 */ 

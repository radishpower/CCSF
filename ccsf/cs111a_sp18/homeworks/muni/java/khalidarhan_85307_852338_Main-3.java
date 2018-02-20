///Arhan Khalid Lab3 java 111A. finding the average daily ridership on a line./// 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String line; int day , riders;
  double avg;
 
    System.out.println("which line you have surveyed?");
    line = scan.nextLine();
    System.out.println("how many days did you survey?");
    day = scan.nextInt();
    System.out.println("how many passengers were there?");
    riders = scan.nextInt();
    
    avg = (double)riders / (day);
    System.out.printf("Riders on daily basis for %s is %.2f",line, avg);
   
  }
}
/*
java version "1.8.0_31"
Java(TM) SE Runtime Environment (build 1.8.0_31-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.31-b07, mixed mode)
   
which line you have surveyed?
 29 muni bus
how many days did you survey?
 45
how many passengers were there?
 3077
Riders on daily basis for 29 muni bus is 68.38
*/
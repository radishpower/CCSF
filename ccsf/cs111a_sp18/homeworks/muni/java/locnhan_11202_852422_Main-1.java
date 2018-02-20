import java.util.Scanner;

  class Main
{
  public static void main(String args[])
  {
    String muni_name;
    
    int num_riders, num_days;
    
    double average_riders;
    
    Scanner keyIn = new Scanner (System.in);

  System.out.println("Welcome and please fill out a survey");
    
  System.out.print("What is the name of the muni?  ");
    
          muni_name = keyIn.nextLine();
    
  System.out.print("how many days the survey was conducted?  ");
    
          num_days = keyIn.nextInt();
    
  System.out.print("How many riders did you count?  ");
    
          num_riders = keyIn.nextInt();

          average_riders = num_riders/(double)num_days;

  System.out.printf(" The average of %,.2f"
    
         + " people\n rode the %s per day after the survey conducted.\n", average_riders, muni_name);
  }
}

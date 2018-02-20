import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String Busline;
    float days, ppl;
    
    Scanner scan= new Scanner (System.in);
    System.out.println("Welcome to the muni ridership survey. We would like to ask you a couple of questions so we can come up with staistics");
    System.out.println("So what Bus did you ride");
      Busline= scan.nextLine();
    System.out.println("How many people did you see");
      ppl= scan.nextInt();
    System.out.println("How many days did you record");
      days = scan.nextInt();
    
    System.out.printf("So according to our analystics about %,.2f people ride the " + Busline + " every day \n", ppl / days);
    
  }
}
/*Welcome to the muni ridership survey. We would like to ask you a couple of questions so we can come up with staistics
So what Bus did you ride
 k
How many people did you see
 5555
How many days did you record
 8
So according to our analystics about 694.38 people ride the k every day */
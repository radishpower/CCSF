/*  MUNI Ridership Calculator
    CS111A - Homework #3
    by Artiom Guzun
    muniApp.java
    Takes survey information form the user as input and outputs the average # of people that
    ride a specific MUNI line per day.
    
 */


import java.util.Scanner;

class Main {
    public static void main (String[] args){

        //declare variables
        String muniLine;
        float numDays, riderCount, riderAverage;
        Scanner muniInput = new Scanner(System.in);

        //main questions and user input
        System.out.println("Which MUNI line did you survey?");
        muniLine = muniInput.nextLine();

        System.out.println("How many days did you survey ridership for?");
        numDays = muniInput.nextInt();

        System.out.println("How many riders did you count?");
        riderCount = muniInput.nextInt();

        //Calculation for the average # of ppl/day
        riderAverage = riderCount/numDays;

        System.out.println("According to your survey, an average of ");
        //average result to the hundredth.
        System.out.printf("%.2f", riderAverage);
        System.out.println(" people rode the "+ muniLine + " per day.");


    }
}


/*=====================================================
Program Output:

Which MUNI line did you survey?
N-Judah
How many days did you survey ridership for?
20
How many riders did you count?
134000
According to your survey, an average of 
6700.00 people rode the N-Judah per day.

Process finished with exit code 0

=====================================================

Which MUNI line did you survey?
L - Taraval
How many days did you survey ridership for?
32
How many riders did you count?
78346
According to your survey, an average of 
2448.31 people rode the L - Taraval per day.

Process finished with exit code 0

=====================================================

Which MUNI line did you survey?
M -Ocean View 
How many days did you survey ridership for?
31
How many riders did you count?
87653
According to your survey, an average of 
2827.52 people rode the M Ocean View  per day.

Process finished with exit code 0
*/

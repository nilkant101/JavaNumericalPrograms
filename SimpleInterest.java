package numberSeries;

import java.util.Scanner;

public class SimpleInterest {
    
    Scanner scan = new Scanner(System.in);
    double principal;
    double rate;
    double time;
    double simpleInterest;
    
    System.out.println("Enter the Principle Amount");
    principal = scan.nextDouble(); 
    System.out.println("Enter the rate ");
    rate = scan.nextDouble(); 
    System.out.println("Enter the time");
    time = scan.nextDouble(); 

    System.out.println("Enter the Principle Amount");
    simpleInterest = (principal * rate * time * simpleInterest) /100;
}

// Wajp TO extract the last digit from the given number 
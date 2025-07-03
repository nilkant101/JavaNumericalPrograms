package numberSeries;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scan = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the Principal Amount: ");
        double principal = scan.nextDouble();

        // Input rate of interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = scan.nextDouble();

        // Input time period in years
        System.out.print("Enter the Time (in years): ");
        double time = scan.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}

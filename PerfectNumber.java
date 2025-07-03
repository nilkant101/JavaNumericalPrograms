package numberSeries;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scan.nextInt();  //30
        
        int sum = 0; 
        // Loop through all numbers from 1 to number/2
        for (int i = 1; i <= number / 2; i++) {    
            if (number % i == 0) {  
                sum = sum + i; // Add the divisor to the sum  
            }
        }  
        // Check if sum of divisors is equal to the original number
        if (sum == number && number != 0) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }

        scan.close();
    }
}

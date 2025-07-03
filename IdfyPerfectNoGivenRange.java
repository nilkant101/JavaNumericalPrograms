package numberSeries;

import java.util.Scanner;

public class IdfyPerfectNoGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        for(int num = 1; num<=100; num++){
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i; // Add the divisor to the sum
            }
        }
        
        if (sum == num && num != 0) {
            System.out.println(number + " is a Perfect Number.");
        } 
        scan.close();
    }
    }
}

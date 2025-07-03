package numberSeries;
import java.util.Scanner;

public class Happynum {
    // Method to calculate sum of squares of digits
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num;

        // Keep replacing the number with sum of squares of its digits
        while (result != 1 && result != 4) {
            result = sumOfSquares(result);
        }

        if (result == 1) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is a Sad Number");
        }

        sc.close();
    }
}

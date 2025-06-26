package numberSeries;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value");
        int num = scan.nextInt();
        int sum = 0;
        while (num !=0) {
        int rem = num % 10;
        sum = sum + rem;
        num= num/10; 
        }
        System.out.println("Sum of digit is "+sum);
    }
}

//WAJP To Findout the sum of didgits


//WAJP To identify the avg of Digits presnt in a given number;
//WAJP To identify The summation of Only Even Digits
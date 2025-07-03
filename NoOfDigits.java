package numberSeries;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value");
        int num = scan.nextInt();
        int count = 0;
        while(num!= 0) {
            // int rem = num % 10;
            count++;
            num = num/10;
            // System.out.println(rem);
        }
        System.out.println("The Number of Digits are: "+count);
    }
}

//WAJP To Findout the sum of didgit
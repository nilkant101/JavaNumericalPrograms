package numberSeries;

import java.util.Scanner;

public class PosiveOrNegative {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();  
        if (num > 0){
            System.out.println(num +" :The number is Positive");
        }else if (num < 0){
            System.out.println(num +" :The number is negative");
        }else{
            System.out.println(num +" :number is zero");
        }
    }
}

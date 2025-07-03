package numberSeries;

import java.util.Scanner;

// wajp check given charector is alphabet or special charector or Digit
public class alSpecDigit {

        public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the Integer charector");
        char ch = scan.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println(ch + " is a Alphabate");
        }else if(ch>'0' && ch<='9') {
            System.out.println(ch +" is a Digit");
        }else{
            System.out.println(ch + " special charector");
        }

   }

}

//Wajp To check the given number is posive or negative
//Wajp for a given senario if the number is divisible by 3 then print raja, if number is divisible  by 5 then print rani if number is divible by 3 and 5 then print raja vs rani
//Wajp to swap the value present i two veriable
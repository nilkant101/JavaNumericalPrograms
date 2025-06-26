//Wajp for a given senario if the number is divisible by 3 then print raja, if number is divisible  by 5 then print rani if number is divible by 3 and 5 then print raja vs rani

package numberSeries;
import java.util.Scanner;

class RajaRani {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers :");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Raja vs Rani");
        }else if(num % 5 == 0 ){
            System.out.println("Rani");
        }else if (num % 3 == 0){
            System.out.println("Raja");
        }
    }
}
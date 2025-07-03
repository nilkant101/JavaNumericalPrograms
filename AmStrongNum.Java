package numberSeries;

import java.util.Scanner;

public class AmStrongNum {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextIn();
        int num1 = num;
        int num2 = num;
        int sum =0;
        int count = 0;
        // step 1 count the digits
        while(num!=0){
            count++;
            num = num/10;
        }
        //step 2 : Extract Each digit and power it with count;
        while(num1!=0){
            int rem = num1%10;
            int pow = 1;
            for( int i ; i<=count ; i++){
                pow = pow*rem;
            }
            sum = sum + pow;
            num1 = num1/10;
        }
        if(num2 == sum ){
            System.out.println(num2+"is a AramStrongNumber");
        }
    }
}

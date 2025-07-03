package numberSeries;

import java.util.Scanner;

public class DisariumNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int temp = num;
        int count = 0;

        // Step 1: Count digits (for position tracking)
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Reverse number to process digits left to right
        temp = num;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        // Step 3: Calculate sum of powered digits
        int sum = 0;
        int position = 1;
        while (reverse != 0) {
            int digit = reverse % 10;

            int pow = 1;
            for (int i = 1; i <= position; i++) {
                pow *= digit;
            }

            sum += pow;
            reverse /= 10;
            position++;
        }

        // Step 4: Check if it's a Disarium number
        if (sum == num) {
            System.out.println(num + " is a Disarium Number.");
        } else {
            System.out.println(num + " is NOT a Disarium Number.");
        }

        scan.close();
    }
}


// package numberSeries;
// // The sum of power of each Digit based ON respective position will be equals to given number
// import java.util.Scanner;

// public class DisariumNum {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scan.nextInt();
//         int num1 = num;
//         int num2 = num; 
//         int sum =0;
//         int count = 0;
//         // step 1 count the digits
//         while(num!=0){ //3
//             count++;
//             num = num/10;
//         }
//         //step 2 : Extract Each digit and power it with count;
//         while(num1!=0){
//             int rem = num1%10;
//             int pow = 1;
//             for( int i ; i<=count; i++){
//                 pow = pow*rem;
//             }
//             count--;
//             sum = sum + pow;
//             num1 = num1/10;
//         }
//         if(num2 == sum ){
//             System.out.println(num2+"is a DisariumgNumber");
//         }else{
//             System.out.println(num2+"is not a DisariumgNumber");
            
//         }
//     }
// }


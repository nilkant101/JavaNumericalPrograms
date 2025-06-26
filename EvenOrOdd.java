package numberSeries;
import java.util.Scanner;

// public class EvenOrOdd {

//     public static void main(String[] args) {

//         Scanner scan  = new Scanner(System.in);
//         System.out.println("Enter the Integer Value");
//         int a = scan.nextInt();
//         if(a % 2 == 0){
//             System.out.println("even");
//         }else{
//             System.out.println("odd number");
//         }
//     }
    
// }

// write a java program to create a method which returns given number is even or odd

// public class EvenOrOdd {

//     public static void main(String[] args) {
//      Scanner scan  = new Scanner(System.in);
//      System.out.println("Enter the Integer Value");
//      int num = scan.nextInt();
//      String res = evenOrOdd(num);
//      System.out.println(num + " is a" + res +" Number");
//     }

//     public static String evenOrOdd(int num){
//         if(num % 2 == 0){
//             return "Even";
//         }
//         else{
//             return "odd";
//         }
//     }

// }


// wajp the given alphabete is uppercase or lower case

public class EvenOrOdd {

    public static void main(String[] args) {
     Scanner scan  = new Scanner(System.in);
     System.out.println("Enter the Integer Value");
     int num = scan.nextInt();
     String res = evenOrOdd(num);
     System.out.println(num + " is a" + res +" Number");
     scan.close();
    }

    public static String evenOrOdd(int num){
        if(num % 2 == 0){
            return "Even";
        }
        else{
            return "odd";
        }
    }
  
}


// Automorphicnumber
// Take a number get a square of it and check if th esquared value ends with the given number then it is auto morphic number

package numberSeries;


import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
    
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Length of Rectangle ");
       int num = scan.nextInt();
       int sq = num*num;
        while (num!=0) {
            int r1 = num% 10;
            int r2 = sq%10;
            if(r1==r2){
                num= num/num;
                sq=sq/10;
            }else break;
        }
        if(num==0){
            System.out.println("Automorphic");
        }else
        System.out.println("not automorphic");    
}   

}       


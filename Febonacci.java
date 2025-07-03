package numberSeries;

import java.util.Scanner;
public class Febonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int sum = 0;
        for(int i=2;i<=num;i++){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(sum);
        }    
    }
}


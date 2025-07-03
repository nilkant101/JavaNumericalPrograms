package numberSeries;

import java.util.Scanner;

// import java.util.Scanner;
public class Feboncybtwrange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.println("enter the Starting Number");
        int st = sc.nextInt();
        System.out.println("enter the Ending Number");
        int en = sc.nextInt();
        for(int i=st; i<=en;i++){
            if(n1>=st && n1 <=en){
                System.out.println(n1+"");
            }
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }  
    }
}

package numberSeries;

// wajp create method return area of rectangle

import java.util.Scanner;

public class AraeOfRectangle {
    public static void main(String[] args) {
    
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Length of Rectangle ");
       double length = scan.nextDouble();
       System.out.println("width of Rectangle");
       double width = scan.nextDouble();
       double res = AreaOfRect(length,width);
       System.out.println("The area of Rectangle is: "+ res);
}
    public static double AreaOfRect(double length, double width){
        return length*width;
    }
}       


// wajp to identify simple intrest
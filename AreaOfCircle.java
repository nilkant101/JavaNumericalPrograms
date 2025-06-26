// Area of cirlcle

package numberSeries;

import java.util.Scanner;

public class AreaOfCircle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double rad = sc.nextDouble();
        double aoc = 3.14 * rad * rad;
        System.out.println("Area of circle: "+ aoc);
    }

}


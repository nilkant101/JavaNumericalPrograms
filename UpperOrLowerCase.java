package numberSeries;
import java.util.Scanner;

public class UpperOrLowerCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);  // Read first character of input

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabet letter.");
        }
        scan.close();
    }
}

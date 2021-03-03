package exercise.exceptions;
import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 1;
        int denominator = 1;
        while ((numerator != -2) &&(denominator != -2)) {
            System.out.print("\nEnter a numerator: ");
            numerator = sc.nextInt();
            System.out.print("\nEnter a denominator: ");
            denominator = sc.nextInt();
            try {
                double fraction = (numerator + 0.0)/(denominator + 0.0);
                System.out.print("\nFraction: " + fraction + "\n");
            } catch (ArithmeticException e) {
                System.out.print("\nEnter a non-zero denominator.\n");
            }
        }
        sc.close();
    }
}

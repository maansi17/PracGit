import java.util.*;
import java.util.Scanner;

public class SquarenFactorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = s.nextInt();

        System.out.println("Square of " + n + " is: " + findSquare(n));
        System.out.println("Factorial of " + n + " is: " + findFactorial(n));
    }

    static int findSquare(int num) {
        return num * num;
    }

    static int findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

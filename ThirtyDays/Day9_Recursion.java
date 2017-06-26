package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/17/17.
 */
public class Day9_Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = factorial(n);
        scanner.close();

        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

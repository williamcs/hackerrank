package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 7/3/17.
 */
public class Day25_RunningTimeComplexity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            boolean isPrime = isPrimeNumber(n);
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    /**
     * To test a number is prime or not
     * @param n
     * @return boolean
     */
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) return false;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}

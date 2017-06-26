package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/18/17.
 */
public class Day10_BinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int max = 0;
        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;

            if (remainder == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count > max) {
                max = count;
            }

            System.out.println(remainder);
        }

        System.out.println("consecutive ones is: " + max);
    }
}

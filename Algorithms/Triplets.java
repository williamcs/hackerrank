package hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by will on 7/7/17.
 */
public class Triplets {

    public static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] result = new int[2];

        if (a0 > b0) {
            result[0]++;
        }
        if (a0 < b0) {
            result[1]++;
        }

        if (a1 > b1) {
            result[0]++;
        }
        if (a1 < b1) {
            result[1]++;
        }

        if (a2 > b2) {
            result[0]++;
        }
        if (a2 < b2) {
            result[1]++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a0 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b0 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " ": ""));
        }
        System.out.println("");
    }
}

package hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by will on 6/20/17.
 */
public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // Complete this function
        assert (n >= 0);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ar[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            arr[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, arr);
        System.out.println(result);
    }
}

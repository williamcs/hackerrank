package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/15/17.
 */
public class Day7_Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        for (int j = n; j > 0; j--) {
            System.out.print(arr[j - 1] + " ");
        }
    }
}

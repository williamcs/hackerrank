package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/19/17.
 */
public class Day11_2DArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int maxGlassSum = maxSum(arr);

        System.out.println(maxGlassSum);
    }

    public static int maxSum(int[][] arr) {
        if (arr == null || arr.length == 0) return 0;
        int row = arr.length;
        int col = arr[0].length;
        int maxValue =  Integer.MIN_VALUE;

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int glassSum = getGlassSum(arr, i, j);
                if (glassSum > maxValue) {
                    maxValue = glassSum;
                }
            }
        }

        return maxValue;
    }

    public static int getGlassSum(int[][] arr, int i, int j) {
        int sum = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (k == 1 && (l == 0 || l == 2)) continue;
                sum += arr[i + k][j + l];
            }
        }

        return sum;
    }
}

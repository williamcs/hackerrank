package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 7/7/17.
 */
public class Day29_BitwiseAnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int result = maxBitAnd(N, K);
            System.out.println(result);
        }
    }

    public static int maxBitAnd(int N, int K) {
        int result = -1;

        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int bitAnd = i & j;
                if (bitAnd > result && bitAnd < K) {
                    result = bitAnd;
                }
            }
        }
        return result;
    }
}

package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/25/17.
 */
class Calculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        if (p == 0) {
            return 1;
        }

        int half = power(n, p / 2);
        if (p % 2 == 1) {
            return n * half * half;
        } else {
            return half * half;
        }
    }
}

public class Day17_MoreExceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

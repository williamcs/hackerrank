package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/14/17.
 */
public class Day6_Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String str = scanner.nextLine();

            StringBuffer oddBuffer = new StringBuffer();
            StringBuffer evenBuffer = new StringBuffer();

            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    evenBuffer.append(str.charAt(j));
                } else {
                    oddBuffer.append(str.charAt(j));
                }
            }

            System.out.println(evenBuffer + " " + oddBuffer);
        }
    }
}

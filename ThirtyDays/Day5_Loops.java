package hackerrank.ThirtyDays;

import java.util.*;

/**
 * Created by will on 6/13/17.
 */
public class Day5_Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }*/

        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        } while (i <= 10);

    }
}

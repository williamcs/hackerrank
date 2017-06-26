package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/22/17.
 */
public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }

    public int computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (i != j) {
                    int difference = Math.abs(elements[i] - elements[j]);
                    if (maximumDifference < difference) {
                        maximumDifference = difference;
                    }
                }
            }
        }

        return maximumDifference;
    }
}
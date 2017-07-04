package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 7/4/17.
 */
public class Day26_NestedLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayActual = scanner.nextInt();
        int monthActual = scanner.nextInt();
        int yearActual = scanner.nextInt();

        int dayExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();

        int fine = getFine(dayActual, monthActual, yearActual,
                dayExpected, monthExpected, yearExpected);
        System.out.println(fine);
    }

    public static int getFine(int dayActual, int monthActual, int yearActual,
                              int dayExpected, int monthExpected, int yearExpected) {
        int fine; // = 0;

        if (yearActual < yearExpected) { // the book returned before the expected year
            fine = 0;
        } else if (yearActual == yearExpected) { // the book is returned on the same year
            if (monthActual < monthExpected) { // the book is returned before the expected month
                fine = 0;
            } else if (monthActual == monthExpected){ // the book is returned on the expected month
                if (dayActual <= dayExpected) { // the book is returned before the expected day
                    fine = 0;
                } else { // the book is returned after the expected day
                    fine = 15 * (dayActual - dayExpected);
                }
            } else { // the book is returned after the expected month
                fine = 500 * (monthActual - monthExpected);
            }
        } else { // the book is returned after the expected year
            fine = 10000;
        }

        return fine;
    }
}

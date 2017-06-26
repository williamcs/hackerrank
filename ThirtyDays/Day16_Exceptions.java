package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/24/17.
 */
public class Day16_Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int result = Integer.parseInt(S);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}

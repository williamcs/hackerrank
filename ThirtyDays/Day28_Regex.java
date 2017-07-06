package hackerrank.ThirtyDays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by will on 7/6/17.
 */
public class Day28_Regex {

    /**
     * To test a email address is gmail
     * @param strEmail
     * @return
     */
    public static boolean containGmail(String strEmail) {
        Pattern p = Pattern.compile("[a-z]@gmail.com");
        Matcher m = p.matcher(strEmail);

        if (m.find()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        List<String> lstStr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while (N-- > 0) {
            String strName = scanner.next();
            String strEmail = scanner.next();

            if (containGmail(strEmail)) {
                lstStr.add(strName);
            }
        }

        Collections.sort(lstStr);

        for (String str: lstStr) {
            System.out.println(str);
        }
    }
}

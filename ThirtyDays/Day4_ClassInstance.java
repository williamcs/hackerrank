package hackerrank.ThirtyDays;

import java.io.*;
import java.util.*;

/**
 * Created by will on 6/12/17.
 */
public class Day4_ClassInstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person1 p = new Person1(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

class Person1 {
    private int age;

    public Person1(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        age = initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String statement = "";
        if (this.age < 13) {
            statement = "You are young.";
        } else if (this.age >= 13 && this.age < 18) {
            statement = "You are a teenager.";
        } else {
            statement = "You are old.";
        }
        System.out.println(statement);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age += 1;
    }
}
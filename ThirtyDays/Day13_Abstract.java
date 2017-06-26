package hackerrank.ThirtyDays;

import java.util.Scanner;

/**
 * Created by will on 6/21/17.
 */

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    // declare the price instance variable
    int price;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     *  Method Name: display
     *
     *  Print the title, author, and price in the specified format
     */
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Day13_Abstract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

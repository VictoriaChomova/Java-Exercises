package problem6;

import java.util.List;

public class Book {
    String author;
    String title;
    int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public static void printInfo(List <Book> bookList, Book book) {
        System.out.printf("Author: %s%nTitle: %s%nYear: %d%n", book.author, book.title, book.year);
        System.out.println("");
    }
}

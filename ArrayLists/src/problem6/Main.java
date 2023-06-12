package problem6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Write book's author:");
            String author = scanner.nextLine();
            System.out.println("Write book's title:");
            String title = scanner.nextLine();
            System.out.println("Write book's year:");
            int year = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(author, title, year));
        }

        for (Book book: bookList) {

            Book.printInfo(bookList, book);

        }

    }
}

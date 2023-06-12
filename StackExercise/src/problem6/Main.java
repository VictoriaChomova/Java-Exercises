package problem6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Book> bookList = new Stack<>();
        for (int i = 0; i < 10; i++) {
            String author = scanner.nextLine();
            String title = scanner.nextLine();
            int year = Integer.parseInt(scanner.nextLine());

            bookList.push(new Book(author, title, year));
        }

        for (Book book : bookList) {

            Book.printInfo(bookList, book);

        }
    }
}

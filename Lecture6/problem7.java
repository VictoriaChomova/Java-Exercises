package Lecture6;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numberLength = input.length();
        int number = Integer.parseInt(input);

        for (int i = numberLength; i > 0; i--) {
            System.out.print(i);
        }
    }
}

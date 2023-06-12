package Lecture03;

import java.util.Locale;
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letterInput = scanner.next().toLowerCase(Locale.ROOT);
        char letter = letterInput.charAt(0);
        if ((int)letter >= 97 && (int) letter <= 122) {
            if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'u' || letter == 'i') {
                System.out.println("The letter is vowel.");
            } else {
                System.out.println("The letter is not vowel.");
            }
        } else {
            System.out.println("The input is not a letter.");
        }
    }
}

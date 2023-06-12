package Lecture03;

import java.util.Locale;
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letterInput = scanner.next().toLowerCase(Locale.ROOT);
        char letter = letterInput.charAt(0);

        int letterNumberInAlphabet = (int)letter - 96;
        System.out.println(letterNumberInAlphabet);
    }
}

package Lecture6;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (!input.equals("q")) {

            int number = Integer.parseInt(input);
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }

            input = scanner.nextLine();

        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}

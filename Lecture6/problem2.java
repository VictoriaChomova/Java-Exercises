package Lecture6;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        int sum = 0;
        while (!input.equals("q")) {

            sum += Integer.parseInt(input);
            count++;
            input = scanner.nextLine();

        }
        double middleAr = sum * 1.0 / count;

        System.out.println(middleAr);
    }
}

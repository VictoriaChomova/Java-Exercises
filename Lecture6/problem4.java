package Lecture6;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        String input = scanner.nextLine();
        while (!input.equals("q")) {
            int number = Integer.parseInt(input);
            if (number % 2 == 0) {
                evenCount++;
            }

            input = scanner.nextLine();
        }
        System.out.println("The count of even numbers is: " + evenCount);
    }
}

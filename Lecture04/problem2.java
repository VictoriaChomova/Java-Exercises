package Lecture04;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 0; i <= 20; i++) {
            int result = x * i;
            System.out.println(i + " * " + x + " = " + result);
        }

    }
}

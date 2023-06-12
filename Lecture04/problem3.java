package Lecture04;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long product = 1;
        if (x <= 10) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 10; i <= x; i++) {
                product *= i;
            }
            System.out.println(product);
        }
    }
}

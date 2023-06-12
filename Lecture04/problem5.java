package Lecture04;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product = 1;
        if (a >= b) {
            System.out.println("Invalid input!");
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    product *= i;
                }
            }
            System.out.println(product);
        }
    }
}

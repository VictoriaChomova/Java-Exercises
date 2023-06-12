package Lecture04;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        if (a >= b) {
            System.out.println("Invalid input!");
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}

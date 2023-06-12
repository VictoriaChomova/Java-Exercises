package Lecture6;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a / 10 != 0) {
            a /= 10;
        }

        while (b / 10 != 0) {
            b /= 10;
        }

        System.out.println((a>b) ? a:b);
    }
}

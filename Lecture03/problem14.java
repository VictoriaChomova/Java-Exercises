package Lecture03;

import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        if ((a != 0 && a != 1) || (b != 0 && b != 1)) {
            System.out.println("Invalid input!");
        } else {
            if (a == 1 && b == 0) {
                c = 0;
            } else {
                c = 1;
            }
            System.out.println(c);
        }

    }
}

package Lecture04;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sum = 0;
        int a = 1;
        while (sum <= x) {
            System.out.print(a);
            sum = a + a + 1;
            a++;
        }

    }
}

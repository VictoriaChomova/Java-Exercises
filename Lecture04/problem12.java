package Lecture04;

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 1; i < x; i++) {
            if (i * i < x) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}

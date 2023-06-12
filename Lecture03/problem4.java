package Lecture03;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x % 3 == 0) {
            System.out.println("The number is dividable by 3.");
        } else {
            System.out.println("The number is not dividable by 3.");
        }
    }
}

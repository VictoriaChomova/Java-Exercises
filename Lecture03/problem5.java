package Lecture03;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year >= 1 && year <= 2100) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.printf("Year %d is leap.", year);
            } else {
                System.out.printf("Year %d is not leap", year);
            }
        } else {
            System.out.println("Unknown year.");
        }
    }
}

package Lecture03;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x % 2 == 0 && x % 3 == 0 && x % 7 == 0) {
            System.out.println("The number is dividable by 2,3 and 7.");
        } else {
            System.out.println("The number is not dividable by 2,3 and 7.");
        }
    }
}

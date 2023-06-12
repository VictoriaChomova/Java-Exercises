package Lecture05;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = new int[10];

        for (int index = 0; index < 10; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(numbersArr[i]);
        }
    }
}

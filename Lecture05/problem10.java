package Lecture05;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];
        int[] condensedArr = new int[5];

        for (int i = 0; i < 10; i++) {
            numbersArr[i] = scanner.nextInt();
        }
        for (int index = 0; index < 5; index++) {
            condensedArr[index] = numbersArr[2 * index] + numbersArr[2 * index + 1];
        }

        for (int index = 0; index < 5; index++) {
            System.out.println(condensedArr[index]);
        }

    }
}

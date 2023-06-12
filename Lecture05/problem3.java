package Lecture05;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];
        int[] evensArr = new int[10];
        int counter = 0;
        for (int index = 0; index < 10; index++) {
            numbersArr[index] = scanner.nextInt();
        }

        for (int index = 0; index < 10; index++) {
            if (numbersArr[index] % 2 == 0 && numbersArr[index] > 0) {
                evensArr[counter] = numbersArr[index];
                counter++;
            }
        }

        for (int i = 0; i < counter ; i++) {
            System.out.println(evensArr[i]);
        }
    }
}

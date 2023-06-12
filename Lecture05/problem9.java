package Lecture05;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];

        for (int i = 0; i < 10; i++) {
            int currentNum = scanner.nextInt();
            if (currentNum % 2 == 0) {
                numbersArr[i] = 0;
            } else {
                numbersArr[i] = currentNum;
            }
        }

        for (int index: numbersArr) {
            System.out.println(index);
        }
    }
}

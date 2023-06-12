package Lecture05;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numbersArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int currentNum = numbersArr[i];
            boolean isPrime = true;
            for (int j = 2; j < currentNum; j++) {
                if (currentNum % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(numbersArr[i]);
            }

        }
    }
}
